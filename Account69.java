import java.lang.*;

public class Account69{
    int accountNumber;
    String accountHolderName;
    double balance;

    public void setAccountNumber(int an)
    {
        accountNumber = an;
    }
    public void setAccountHolderName(String ahn)
    {
        accountHolderName = ahn;
    }
    public void setBalance(double b)
    {
        balance = b;
    }
    
    public int getAccountNumber( )
    {
        return accountNumber;
    }
    public String getAccountHolderName( )
    {
        return accountHolderName;
    }
    public double getBalance( )
    {
        return balance;
    }
    public void showDetails( )
    {
        System.out.println("Account No. : " + + accountNumber);
        System.out.println("Account Holder Name : " +  accountHolderName);
        System.out.println("Account Balance : " +  balance);
    }
}