import java.util.Scanner;
import java.lang.*;

public class Account{
   private int accountNum;
   private  String accountName;
   private double balance;

   public Account(){}
   
   public Account(int accountNum, String accountName, double balance){
    this.accountNum = accountNum;
    this.accountName = accountName;
    this.balance = balance;
    }

   public void showDetails(){
    System.out.println("Account Num: " + accountNum);
    System.out.println("Account Name: " + accountName);
    System.out.println("Balance: $" + balance);
   }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of object you want to create: ");
        int numObjects = scanner.nextInt();

        Account[] accounts = new Account[numObjects];

        for (int i = 0; i < numObjects; i++) {

            System.out.println("\nFor Object " + (i + 1) + ":");
            
            System.out.print("Enter Account Number: ");
            int accountNum = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter Account Name: ");
            String accountName = scanner.nextLine();
            
            System.out.print("Enter Balance: $");
            double balance = scanner.nextDouble();

            accounts[i] = new Account(accountNum, accountName, balance);
        }

        System.out.println("\nAccount details:");

        for (int i = 0; i < numObjects; i++) {
            System.out.println("\nFor Object " + (i + 1) + ":");
            accounts[i].showDetails();
        }

        scanner.close();
    }
}