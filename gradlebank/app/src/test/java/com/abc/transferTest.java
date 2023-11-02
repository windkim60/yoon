package com.abc;

import com.abc.account.MaxiSavingsAccount;
import com.abc.account.SavingsAccount;
import com.abc.account.CheckingAccount;
import support.transfer;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

public class transferTest {
    
    @Test
    public void transfermoney() {
        
        LocalDate date = LocalDate.now();    
        transfer t; 
         
        SavingsAccount raksAccount = new SavingsAccount();
        raksAccount.setAccountName("raks");
        raksAccount.deposit(500.0, date);
         
        CheckingAccount billsAccount = new CheckingAccount();
        billsAccount.setAccountName("bills");
        billsAccount.deposit(200.0, date);
         
        MaxiSavingsAccount tomAccount = new MaxiSavingsAccount();
        tomAccount.setAccountName("tom");
         tomAccount.deposit(600.0, date);
                
        t = new transfer();

        int i = t.moveMoney(raksAccount, billsAccount, 100.00, date);

         try {
           assertEquals(1, i);
   
           assertEquals(400.0, raksAccount.getBalance(),0);

           assertEquals(300.0, billsAccount.getBalance(),0);
           
           System.out.println("TransferTest Success1");
        }
        catch (AssertionError e) {
           System.out.println("TransferTest Fail1");
        }
    
    
        i = t.moveMoney(billsAccount, tomAccount, 200.00, date);
        
               
         try {
           assertEquals(1, i);

           assertEquals(100.0, billsAccount.getBalance(),0);

           assertEquals(800.0, tomAccount.getBalance(),0);
           
           System.out.println("TransferTest Success2");
        }
        catch (AssertionError e) {
           System.out.println("TransferTest Fail2");
        }
         
          i = t.moveMoney(billsAccount, tomAccount, 200.00, date);
        
               
         try {
           assertEquals(1, i);
                      
           assertEquals(-100.0, billsAccount.getBalance(),0);

           assertEquals(1000.0, tomAccount.getBalance(),0);
            
           System.out.println("TransferTest Success3");
        }
        catch (AssertionError e) {
           System.out.println("TransferTest Fail3");
        }
         
         
    }

}
