import java.util.Scanner;

public class Pattern1{
    public static void main(String [] args){
        int num [] = new int [10];
        Scanner input = new Scanner (System.in);

        System.out.println("Enter 10 numbers : ");
        for(int i = 0; i < 10; i++){
            num[i] = input.nextInt();
        }

        System.out.println("Your pattern is : ");
        for(int row = 0; row < 10; row++)
        {
            for(int col = 0; col <= row; col++)
            {
                System.out.print(num[row] + " ");
            }
            System.out.println();
        }

    }
}