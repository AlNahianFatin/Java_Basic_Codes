import java.util.Scanner;

public class xToThePowerN{
    public static void printResult(int x, int n){
        int result = 1;
        if( n > 2){
        for(int i = 1; i <= n; i++){
            result = result * x;
            }
        }
        else{
            result = x * 1;
        }
        System.out.println("Your final result : " + result);
    }

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the base number : ");
        int x = input.nextInt();
        
        System.out.print("Enter the power number : ");
        int n = input.nextInt();

        printResult(x, n);        
    }
}