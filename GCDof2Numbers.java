import java.util.*;

public class GCDof2Numbers{
    public static void GCD(int x, int y){
        int smallest, GCD = 1;
        if(x < y){
            smallest = x;
        }
        else{
            smallest = y;
        }

        for(int i = 1; i < smallest; i++){
            if( x % i == 0 && y % i == 0){
                GCD = GCD * i;
            }
            else{
                continue;
            }
        }
        System.out.println("GCD = " + GCD);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 2 numnbers : ");
        int x = input.nextInt();
        int y = input.nextInt();

        GCD(x, y);
    }
}