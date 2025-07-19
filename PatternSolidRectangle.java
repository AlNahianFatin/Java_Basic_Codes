import java.util.Scanner;

public class PatternSolidRectangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int row = input.nextInt();
        
        System.out.print("Enter numer of columns : " );
        int col = input.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}