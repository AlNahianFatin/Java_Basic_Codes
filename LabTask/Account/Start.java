import java.util.Scanner;
public class Start{
    public static void main(String[] args){
        Account myAccount = new Account();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Account Name : ");
        String accountName = scanner.nextLine();
        System.out.print("Enter Your Account Number : ");
        int accountNum = scanner.nextInt();
        System.out.print("Enter Your Account Balance : ");
        double balance = scanner.nextDouble();

        myAccount.setAccountName(accountName);
        myAccount.setAccountNum(accountNum);
        myAccount.setBalance(balance);

        System.out.println("\nYour account details : ");
        myAccount.showDetails();
    }
}
