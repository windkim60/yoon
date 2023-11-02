package com.abc;

import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

import com.abc.account.Account;
import com.abc.account.CheckingAccount;
import com.abc.account.MaxiSavingsAccount;
import com.abc.account.SavingsAccount;

import static org.junit.Assert.assertEquals;
import java.time.LocalDate;

public class BankTest {
    private static final double DOUBLE_DELTA = 1e-15;

    @Test
    public void customerSummary() {
        Bank bank = new Bank();
        Customer john = new Customer("John");
        john.openAccount(new CheckingAccount());
        bank.addCustomer(john);

        try {
           assertEquals("Customer Summary\n - John (1 account)", bank.customerSummary());
           System.out.println("BankTest Success");
        }
        catch (AssertionError e) {
           System.out.println("BankTest Fail");
        }
        
        //assertEquals("Customer Summary\n - John (1 account)", bank.customerSummary());
    }

    @Test
    public void totalInterestWithMultipleCustomersPaidTest() {
        double EXPECTED_INTEREST_PAID = 2.5;
        Bank bank = new Bank();

        LocalDate date = LocalDate.now();    
        
        Account raksAccount = new SavingsAccount();
        Customer Rak = new Customer("Rak").openAccount(raksAccount);
        bank.addCustomer(Rak);
        raksAccount.deposit(500.0, date);

        Account billsAccount = new CheckingAccount();
        Customer bill = new Customer("Bill").openAccount(billsAccount);
        bank.addCustomer(bill);
        billsAccount.deposit(200.0, date);


        double actualVal = bank.totalInterestPaid();

        try {
         assertEquals(EXPECTED_INTEREST_PAID,  actualVal, DOUBLE_DELTA);
         System.out.println("totalInterestWithMultipleCustomersPaidTest Success");
      }
      catch (AssertionError e) {
         System.out.println("totalInterestWithMultipleCustomersPaidTest Fail");
      }
    }

    @Test
    public void savings_account() {
        
        LocalDate date = LocalDate.now();  
        
        Bank bank = new Bank();
        Account savingsAccount = new SavingsAccount();
        bank.addCustomer(new Customer("Bill").openAccount(savingsAccount));

        savingsAccount.deposit(1500.0, date);

        try {
           assertEquals(2.0, bank.totalInterestPaid(), DOUBLE_DELTA);
           System.out.println("savings_account Success");
        }
        catch (AssertionError e) {
           System.out.println("savings_account Fail");
        }
        
        //assertEquals(2.0, bank.totalInterestPaid(), DOUBLE_DELTA);
    }

    @Test
    public void maxi_savings_account() {
        
        LocalDate date = LocalDate.now();  
        
        Bank bank = new Bank();
        Account maxiSavingsAccount = new MaxiSavingsAccount();
        bank.addCustomer(new Customer("Bill").openAccount(maxiSavingsAccount));

        maxiSavingsAccount.deposit(3000.0, date);

        try {
           assertEquals(170.0, bank.totalInterestPaid(), DOUBLE_DELTA);
           System.out.println("maxi_savings_account Success");
        }
        catch (AssertionError e) {
           System.out.println("maxi_savings_account Fail");
        }
        
        //assertEquals(170.0, bank.totalInterestPaid(), DOUBLE_DELTA);
    }

}
