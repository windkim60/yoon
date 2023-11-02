package com.abc;

import org.junit.jupiter.api.Test;
import com.abc.account.SavingsAccount;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;

public class TransactionTest {
    @Test
    public void transaction() {
 
        LocalDate date = LocalDate.now();    
        SavingsAccount savingsAccount = new SavingsAccount();
 
        Transaction t = new Transaction(5, savingsAccount, date);
        
         try {
           assertTrue(t instanceof Transaction);
           System.out.println("TransactionTest Success");
        }
        catch (AssertionError e) {
           System.out.println("TransactionTest Fail");
        }
    }
}
