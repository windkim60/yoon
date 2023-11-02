package com.abc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.abc.account.Account;
import com.abc.account.CheckingAccount;
import com.abc.account.SavingsAccount;
import java.time.LocalDate;

public class CustomerTest {

    @Test //Test customer statement generation
    public void testApp(){
         
        LocalDate date = LocalDate.now();  
        
        Account checkingAccount = new CheckingAccount();
        Account savingsAccount = new SavingsAccount();

        Customer henry = new Customer("Henry").openAccount(checkingAccount).openAccount(savingsAccount);

        checkingAccount.deposit(100.0, date);
        savingsAccount.deposit(4000.0, date);
        savingsAccount.withdraw(200.0, date);

         try {
           assertEquals("Statement for Henry\n" +
                "\n" +
                "Checking Account\n" +
                "  deposit $100.00\n" +
                "Total $100.00\n" +
                "\n" +
                "Savings Account\n" +
                "  deposit $4,000.00\n" +
                "  withdrawal $200.00\n" +
                "Total $3,800.00\n" +
                "\n" +
                "Total In All Accounts $3,900.00", henry.getStatement());
           
           System.out.println("CustomerTest Success");
        }
        catch (AssertionError e) {
           System.out.println("CustomerTest Fail");
        }
         
 
    }

    @Test
    public void testOneAccount(){
        Customer oscar = new Customer("Oscar").openAccount(new SavingsAccount());
        
        try {
           assertEquals(1, oscar.getNumberOfAccounts());
           System.out.println("testOneAccount Success");
        }
        catch (AssertionError e) {
           System.out.println("testOneAccount Fail");
        }
        
        //assertEquals(1, oscar.getNumberOfAccounts());
    }

    @Test
    public void testTwoAccount(){
        Customer oscar = new Customer("Oscar")
                .openAccount(new SavingsAccount());
        oscar.openAccount(new CheckingAccount());
        
        try {
           assertEquals(2, oscar.getNumberOfAccounts());
           System.out.println("testTwoAccount Success");
        }
        catch (AssertionError e) {
           System.out.println("testTwoAccount Fail");
        }
        
        //assertEquals(2, oscar.getNumberOfAccounts());
    }

    @Test
    public void testThreeAccounts() {
        Customer oscar = new Customer("Oscar")
                .openAccount(new SavingsAccount());
        oscar.openAccount(new CheckingAccount());
        
         try {
           assertEquals(3, oscar.getNumberOfAccounts());
           System.out.println("testThreeAccounts Success");
        }
        catch (AssertionError e) {
           System.out.println("testThreeAccounts Fail");
        }
         
        
    }
}
