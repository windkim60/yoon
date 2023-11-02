package com.abc.account;

import com.abc.Transaction;
import com.abc.calculator.InterestCalculator;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import support.DailyBalance;
import java.util.*;  
import java.time.Period; 

public class Account {

    public List<Transaction> transactions;
    private final InterestCalculator interestCalculator;
    private LocalDate OpenDate;
    public String Name;
    
    public Account(InterestCalculator interestCalculator) {
         this.interestCalculator = interestCalculator;
         this.transactions = new ArrayList<Transaction>();
         
         OpenDate = LocalDate.now();    
         
       
    }

    public void deposit(double amount, LocalDate Date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        } else {
            transactions.add(new Transaction(amount, this, Date));
        }
    }

    public void withdraw(double amount, LocalDate Date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        } else {
            transactions.add(new Transaction(-amount, this,  Date ));
        }
    }

    public double interestEarned() {
        double amount = sumTransactions();
        return interestCalculator.calculateInterest(amount);
    }

    public double sumTransactions() {
        return checkIfTransactionsExist(true);
    }

    private double checkIfTransactionsExist(boolean checkAll) {
        double amount = 0.0;
        for (Transaction t : transactions)
            amount += t.amount;
        return amount;
    }

    public String getAccountName() {
        return this.Name;
    }

    public String setAccountName(String Name) {
        return this.Name = Name;
    }
    
    public LocalDate getAccountOpenDate() {
        return this.OpenDate;
    }

    public LocalDate setAccountOpenDate(LocalDate Date) {
        return this.OpenDate = Date;
    }
    
    private static final String ACCOUNT_TYPE_FORMAT  = "%s Accounts\n";

    public String printAccountType() {
        return String.format(ACCOUNT_TYPE_FORMAT, getAccountName());
    }

    
   public double getBalance() {
		
		double balance = 0;
		for (Transaction t : this.transactions) {
                    
                                                String accountName = t.getAccountName(); 
                                                if (accountName.equals(this.getAccountName())) {   
			balance += t.getAmount();
                                                }           
		}
		return balance;
	}

   public void addTransaction(double amount, LocalDate Date) {

	Transaction newTrans = new Transaction(amount,  this, Date);
	this.transactions.add(newTrans);
}
   
  public ArrayList UpdateBalnces(ArrayList<DailyBalance> abalances, LocalDate Date, double CurrentBalance, int days) {
       
      
      double ccbalance = CurrentBalance;
      DailyBalance p,q;
      
      for (int i=0  ; i < days; ++i) {
      
             if (i ==0)  {
                    p = abalances.get(0);
                    p.setBalance(ccbalance);
             }
             else{ 
                q =  abalances.get(i-1);
                p = abalances.get(i);
                
                ccbalance = q.getBalance();
                
                double totalamount = 0;
                for (Transaction t : transactions) {
                        if (t.getDate().equals(q.getDate())) {
                            totalamount = -t.getAmount();
                        }
                }
         
               ccbalance = ccbalance + totalamount;   
               p.setBalance(ccbalance);
         
        }

     } 
    
    return abalances;  
 
}

public static int  givenTwoDates(LocalDate aDate, LocalDate bDate)  {  
 
    Period period = Period.between(aDate, bDate);
    int diff = Math.abs(period.getDays());
    
    return diff;

}

  public ArrayList getRecentBalance(int Days) {
		
         ArrayList abalances = new ArrayList() ;
         
         LocalDate date = LocalDate.now(); 
         
         int diff = givenTwoDates(OpenDate, date.plusDays(-Days) );
         if (diff  > 0){
                Days = Days -diff;
         }
         
         LocalDate startdate = date.plusDays(-Days+1);    
         
         for (int i = 1; i <= Days; ++i) {
                 DailyBalance item = new DailyBalance(0, startdate, 0);
                 item.setDate( startdate.plusDays(i-1));
                 abalances.add(item);
        }
         
         Collections.sort(abalances);  

         abalances = UpdateBalnces(abalances, date, this.getBalance(), Days );
         
         //abalances.forEach(balance->System.out.println(balance.toString()));
         
        return abalances;
}
   
    public boolean IsAnywidrawIn10Days (LocalDate aDay) {
        
         LocalDate tenDay = aDay.plusDays(-11);
        
        boolean IsWithdraw = false;
        
        for (Transaction t : transactions) {
                   LocalDate aTransactionDate = t.getDate();
                        
                   if (t.getAccountName().equals(this.getAccountName())){
                        if ((aTransactionDate.isBefore(aDay)) && (aTransactionDate.isAfter(tenDay))) {
                            if ( t.getAmount() < 0 )  {
                                IsWithdraw = true;
                                break;
                            }
                        }
                   }    
                }
        
        return IsWithdraw;
    }


    public InterestCalculator getCalculator(){
    
        return interestCalculator;
    }


}
