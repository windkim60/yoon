package com.abc.calculator;


public class MaxiSavingsInterestCalculator implements InterestCalculator {

    @Override
    public double calculateInterest(double amount) {

        return 0;
    }

   public double InterestWithoutWithdraw(double amount) {
       
        return amount  * (0.05/365); 
    } 
   
   public double InterestWithWithdraw(double amount) {
       
        return amount  * (0.001/365); 
    } 
   

}
