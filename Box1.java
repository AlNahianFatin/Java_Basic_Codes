import java.util.Scanner;

class Box1{
    private double length;
    private double width;
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        Box1 b1 = new Box1();
        
        int x;
        double dl;
        String name;
        System.out.println("Take input: ");
        name = input.nextLine();
        x = input.nextInt();
        dl = input.nextDouble();
       
        System.out.println("x = " + x);
        System.out.println("y = " + dl);
        System.out.println("name = " + name);

    }
}