import java.util.*;

public class printFibonacciSequenceWithoutArray{
    public static void print(int n){
        int num0 = 0, num1 = 1, sum = 0;
        System.out.print("\nYour " + n + " terms of the sequence is : \n" + num0 + " ");
        for(int i = 1; i < n; i++){
            sum = num0 + num1;
            num0 = num1;
            num1 = sum; 
            System.out.print(num0 + " ");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the terms of the Fibonacci series you want to know : ");
        int n = input.nextInt();
        print(n);
    }
}