
package support;

import com.abc.account.MaxiSavingsAccount;
import com.abc.account.SavingsAccount;
import com.abc.account.CheckingAccount;
import java.time.LocalDate;

public class transfer {
  
    
    public int moveMoney(CheckingAccount FromAccount, SavingsAccount ToAccount, double Money, LocalDate Date){
        
          if (FromAccount.getBalance() <= Money)
            return 0;
    
          FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);

         return 1;

   }
    
   
    public int moveMoney(CheckingAccount FromAccount, MaxiSavingsAccount ToAccount, double Money, LocalDate Date){
        
           if (FromAccount.getBalance() <= Money)
            return 0;
          
         FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);
 
         return 1;

   }

    public int moveMoney(SavingsAccount FromAccount, CheckingAccount ToAccount, double Money, LocalDate Date){
        
          if (FromAccount.getBalance() <= Money)
            return 0;
         
        FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);
 
         return 1;

   }

    public int moveMoney(SavingsAccount FromAccount, MaxiSavingsAccount ToAccount, double Money, LocalDate Date){
        
         
         if (FromAccount.getBalance() <= Money)
            return 0;
         
         FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);
         
         return 1;

   }

     public int moveMoney(MaxiSavingsAccount FromAccount, CheckingAccount ToAccount, double Money, LocalDate Date){
        
          if (FromAccount.getBalance() <= Money)
            return 0;
          
         FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);
         
         return 1;

   }

    public int moveMoney(MaxiSavingsAccount FromAccount, SavingsAccount ToAccount, double Money, LocalDate Date){
        
         if (FromAccount.getBalance() <= Money)
            return 0;
         
         FromAccount.withdraw(Money, Date);
         ToAccount.deposit(Money, Date);
         return 1;
   }

}
   


