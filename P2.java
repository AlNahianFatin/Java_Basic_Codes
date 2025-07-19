import java.util.Scanner;

public class P2{
    public static void main(String [] args){
     
        Scanner input = new Scanner (System.in);

        System.out.print("Enter how many numbers you want to print : ");
        int size = input.nextInt();
        int num [] = new int [size];

        System.out.println("Enter the " + size + " numbers : ");2
        for(int i = 0; i < num.length; i++){
            num[i] = input.nextInt();
        }

        System.out.println("Your pattern is : ");
        for(int i = 0; i < num.length; i++){
            for(int row = 0; row < 4; row++){
                for(int col = 0; col < (row+1); col++){
                    System.out.print(num[i] + " ");
                    i++;
                }
                System.out.println();
            }
        }

    }
}