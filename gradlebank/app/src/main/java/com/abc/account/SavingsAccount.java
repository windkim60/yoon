package com.abc.account;

import com.abc.calculator.SavingsInterestCalculator;
import com.abc.Transaction;

public class SavingsAccount extends Account {

    public SavingsAccount() {
        super(new SavingsInterestCalculator());
    }

   

}
