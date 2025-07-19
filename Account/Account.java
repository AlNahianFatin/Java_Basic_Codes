import java.util.Scanner;
import java.lang.*;
public class Account {
    private String accountName;
    private int accountNum;
    private double balance;

    public Account(){

    }
    public void setAccountNum(int accountNum){
        this.accountNum = accountNum;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
   public void setBalance(double balance){
        this.balance = balance;
   }
   
   public int getAccountNum(){
    return accountNum;
   }
   public String getAccountName(){
    return accountName;
   }
   public double getbalance(){
    return balance;
   }
   
   public void showDetails(){
    System.out.println("Account Number : " + accountNum);
    System.out.println("Account Name : " + accountName);
    System.out.println("Account Balance : " + balance);
   }
}
public class Start {
    public static void main(String[] args){
        Account myAccount = new Account();
        Scanner scannner = new Scanner(System.in);

        System.out.print("Enter Your Account Name : ");
        String accountName = scanner.nextLine();
        System.out.println("Enter Your Account Number : ");
        String accountNum = scanner.nextInt();
        System.out.println("Enter Your Account Balance : ");
        String balance = scanner.nextDouble();

        myAccount.setAccountName(accountName);
        myAccount.setAccountNum(accountNum);
        myAccount.setBalance(balance);

        System.out.println("Your account details : ");
        myAccount.showDetails();
    }
}
