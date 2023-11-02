package com.abc.account;

import com.abc.calculator.MaxiSavingsInterestCalculator;
import support.DailyBalance;
import java.util.ArrayList;

public class MaxiSavingsAccount extends Account {

    private ArrayList<DailyBalance> abalances ;
    
    public MaxiSavingsAccount() {
        
        super(new MaxiSavingsInterestCalculator());
    }

   public ArrayList GetBalanceSheet(int Days) {
       
        return this.getRecentBalance(Days);
    } 

   public double interestCalculation(int Days) {
       
        abalances = this.getRecentBalance(Days);
        return 1.0;
    } 
   
}
