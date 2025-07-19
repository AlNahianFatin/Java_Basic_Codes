import java.util.Scanner;

public class C{
public static void main(String[] args){

    Scanner sc = new Scanner (System.in);

    System.out.print("Enter 1st number : ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd number : ");
    int b = sc.nextInt();

    if(a==b){
        System.out.println("Numbers are equal");
    }
    else if(a>b){
        System.out.println("1st number is bigger");
    }
    else{
        System.out.println("2nd number is bigger");
    }
}
}