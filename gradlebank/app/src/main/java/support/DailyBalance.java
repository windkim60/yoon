package support;

import java.time.LocalDate;
import java.util.*;
//import java.util.Comparator;

public class DailyBalance implements Comparable<DailyBalance> {
 
    private double balance;
    private LocalDate Date;
    private double interest;
 
     public DailyBalance(double balance, LocalDate Date, double interest) {
 
        this.balance = balance;
        this.Date = Date;
        this.interest = interest;
    }
 
    public double getBalance() { return this.balance; }
    public void setBalance(double abalance) {
        this.balance = abalance;
    }
 
    public LocalDate getDate() { return this.Date; }
    public void setDate(LocalDate aDate) {
        this.Date = aDate;
    }
    
    public double getInterest() { return this.interest; }
    public void setInterest(double ainterest) {
        this.interest = ainterest;
    }
 
    @Override 
    public int compareTo(DailyBalance aBalance) {
        
         return aBalance.Date.compareTo(Date);
 
     }
 
    @Override 
    public String toString() {
        return "[ Date=" + Date + ", balance=" + balance + ", interest=" + interest + "]";
    }
    
}