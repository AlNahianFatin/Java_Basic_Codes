import java.util.Scanner;
public class CashOut{
	private int accountNo;
	private double balance;
	public static double perDayTransactionLimit;
	
	public CashOut( ){ }
	public CashOut(int an, double b){
		accountNo = an; 	balance = b;
	}

	public void addInterest(double rate){
        balance  = balance + (balance * rate / 100);
		System.out.println( "Your Current Balance : " + balance );
	}

	public void show( ){
		System.out.println("\nYour Account No : " + accountNo);
		System.out.println("Your Previous Balance : " + balance);
	}

    public void limit(double perDayTransactionLimit){
        
        if(perDayTransactionLimit <= balance)
        {
            if (perDayTransactionLimit <= 25000)
            {
                System.out.println("You can cash out.");
            }
            else
            {
                System.out.println("Sorry you can't cash out right now as you are crossing the per day cash out limit.");
            }
        }
        else
        {
            System.out.println("Sorry you don't have that much amount in your current balance.");
        }
      
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        

        int  accountNo;
        double balance;
        double rate;
        double limit;

        System.out.print("Enter Account No. : ");
        accountNo = input.nextInt();

        System.out.print("Enter Balance : ");
        balance = input.nextDouble();
        
        System.out.print("Enter Interest Rate : ");
        rate = input.nextDouble();

        CashOut anAccount = new CashOut(accountNo, balance);
        
        anAccount.show();
        anAccount.addInterest(rate);
        
         System.out.print("\nEnter how much u wanna cash out :");
         limit = input.nextDouble();

         anAccount.limit(limit);
    }
}