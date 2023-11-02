package com.abc;

import com.abc.account.Account;
import java.time.LocalDate;

public class Transaction {
 
	public double amount;
	private LocalDate timestamp;
	private Account inAccount;
        
	public Transaction(double amount, Account inAccount, LocalDate Date){
		
                        this.amount = amount;
                        this.inAccount = inAccount;
                        this.timestamp = Date;
		
	}
                
                   /*getAmount method returns amount;*/

                    public double getAmount() {
                        return this.amount;
	
                    }

                   public String getAccountName() {
                        return this.inAccount.getAccountName();
	
                    }
                   
                    public LocalDate getDate() {
                        return this.timestamp;
	
                    }
                    
        
  }
	

