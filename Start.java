import java.util.Scanner;
import java.lang.*;

public class Account{
   public static int accountNum, obj;
   public  static String accountName;
   public static double balance;

   public Account(){

   }
   
   public Account(int obj){
    this.obj=obj;
   }

   public void setAccountNum(int accountNum){
    this.accountNum = accountNum;
    
   }

   for(int i = 1; i<=obj; i++){
    System.out.println("Demo " + i);

   }
}

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of objects you want to create: ");
        int numObjects = scanner.nextInt();
        scanner.nextLine(); 

        Account accounts = new Account(numObjects); 

        for (int i = 1; i <= numObjects; i++) {
            Account account = new Account();

            System.out.println("\nFor Object " + (i + 1) + ":");
            
            System.out.print("Enter Account Number: ");
            int accountNum = scanner.nextInt();
            scanner.nextLine(); 
            
            System.out.print("Enter Account Name: ");
            String accountName = scanner.nextLine();
            
            System.out.print("Enter Balance: $");
            double balance = scanner.nextDouble();
            
            account.setAccountNum(accountNum);
            account.setAccountName(accountName);
            account.setBalance(balance);
            
            accounts[i] = account; // Store the created account in the array
        }

        // Display account details for all objects
        for (int i = 0; i < numObjects; i++) {
            System.out.println("\nFor Object " + (i + 1) + ":");
            accounts[i].showDetails();
        }

        scanner.close();
    }
}
