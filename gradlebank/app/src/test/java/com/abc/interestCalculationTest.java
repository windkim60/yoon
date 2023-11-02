package com.abc;

import com.abc.account.MaxiSavingsAccount;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;
import java.util.ArrayList;
import support.DailyBalance;
import com.abc.calculator.MaxiSavingsInterestCalculator;

public class interestCalculationTest {
    
        LocalDate date = LocalDate.now();    
        ArrayList abalances  ;
        private static final double DOUBLE_DELTA = 1e-15;
        
        @Test
        public void testInterest1() {
            
            LocalDate date = LocalDate.now();    
            
            MaxiSavingsAccount JimAccount = new MaxiSavingsAccount();
            
            JimAccount.setAccountOpenDate(date.plusDays(-31));
            JimAccount.setAccountName("Jim");
            
            
            JimAccount.deposit(1600.0, date.plusDays(-20));
            
            abalances = JimAccount.getRecentBalance(32); 
            MaxiSavingsInterestCalculator Calculator = (MaxiSavingsInterestCalculator)JimAccount.getCalculator();
            
            int asize = abalances.size();
            
            MakeInterest(JimAccount,  Calculator );
            
            double TotalInterest= 0;
            
            for (int i=0; i< asize; ++i){
                DailyBalance  aitem = (DailyBalance)abalances.get(i);
                TotalInterest = TotalInterest + aitem.getInterest();
           }
            
            PrintBalance(TotalInterest, "Jim's Account");
            
            
            try {
                    assertEquals(4.383561643835617,  TotalInterest, DOUBLE_DELTA);
                    System.out.println("Test Interest1 Success");
            }
            catch (AssertionError e) {
                    System.out.println("Test Interest1 Fail");
            }
          }
        
         private void PrintBalance(double TotalInterest, String AccountName){
             
            System.out.println("*** " + AccountName  +" ***");
            abalances.forEach(balance->System.out.println(balance.toString()));
   
            
            System.out.println("***********");
            System.out.println("Total Interest: " + TotalInterest);
            
            System.out.println("***********");
            
         }
         
         private void MakeInterest(MaxiSavingsAccount JimAccount, MaxiSavingsInterestCalculator Calculator ){
             
             int asize = abalances.size();
            
            for (int i=0; i< asize; ++i){
                DailyBalance  aitem = (DailyBalance)abalances.get(i);
                double abalance = aitem.getBalance();
                double ainterest;
                
                if ( i ==0 ){
                   aitem.setInterest(0);
                   
                }
                else if ((i>0) && (i<asize-10)){
                    
                    if (JimAccount.IsAnywidrawIn10Days(aitem.getDate())){
                        ainterest = Calculator.InterestWithWithdraw(abalance);
                     }
                    else{
                        ainterest = Calculator.InterestWithoutWithdraw(abalance);
                    }
                    
                    aitem.setInterest(ainterest);
                }
                else{
                    
                    ainterest = Calculator.InterestWithWithdraw(abalance);
                    aitem.setInterest(ainterest);
                }
                } 
         }
         
        @Test
        public void testInterest2() {
            
            LocalDate date = LocalDate.now();    
            
            MaxiSavingsAccount JimAccount = new MaxiSavingsAccount();
            
            JimAccount.setAccountOpenDate(date.plusDays(-31));
            JimAccount.setAccountName("Jim");
            
            
            JimAccount.deposit(1600.0, date.plusDays(-20));
            JimAccount.withdraw(600.0, date.plusDays(-15));
            
            abalances = JimAccount.getRecentBalance(32); 
            MaxiSavingsInterestCalculator Calculator = (MaxiSavingsInterestCalculator)JimAccount.getCalculator();
            
            MakeInterest(JimAccount,  Calculator );

            
             int asize = abalances.size();
            double TotalInterest= 0;
            
            for (int i=0; i< asize; ++i){
                DailyBalance  aitem = (DailyBalance)abalances.get(i);
                TotalInterest = TotalInterest + aitem.getInterest();
           }
            
            PrintBalance(TotalInterest, "Jim's Account");
            
            try {
                    assertEquals(1.8082191780821917,  TotalInterest, DOUBLE_DELTA);
                    System.out.println("Test Interest2 Success");
            }
            catch (AssertionError e) {
                    System.out.println("Test Interest2 Fail");
            }
          }
        
        @Test
        public void testInterest3() {
            
            LocalDate date = LocalDate.now();    
            
            MaxiSavingsAccount tomAccount = new MaxiSavingsAccount();
            
            tomAccount.setAccountOpenDate(date.plusDays(-31));
            tomAccount.setAccountName("tom");
            
            tomAccount.deposit(700.0, date.plusDays(-20));
            tomAccount.withdraw(100.0, date.plusDays(-15));
            tomAccount.deposit(300.0, date.plusDays(-10));
            tomAccount.withdraw(200.0, date.plusDays(-5));        ;
            tomAccount.deposit(600.0, date);
            
             abalances = tomAccount.getRecentBalance(30); 
            MaxiSavingsInterestCalculator Calculator = (MaxiSavingsInterestCalculator)tomAccount.getCalculator();
            
            int asize = abalances.size();
            
            MakeInterest(tomAccount,  Calculator );

            double TotalInterest= 0;
            
            for (int i=0; i< asize; ++i){
                DailyBalance  aitem = (DailyBalance)abalances.get(i);
                TotalInterest = TotalInterest + aitem.getInterest();
           }
            
            PrintBalance(TotalInterest, "Tom's Account");
            
            try {
                    assertEquals(0.4021917808219178,  TotalInterest, DOUBLE_DELTA);
                    System.out.println("Test Interest3 Success");
            }
            catch (AssertionError e) {
                    System.out.println("Test Interest3 Fail");
            }

        }
}
