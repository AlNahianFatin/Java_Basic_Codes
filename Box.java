import java.util.Scanner;

class Box{

    private double length;
    private double width;

    public static void main(String [] args){

        Scanner inputObj = new Scanner(System.in);
        Box b1 = new Box();
        double length, width;
        String name;

        System.out.println("Take length and width: ");
        length = inputObj.nextDouble();
        width = inputObj.nextDouble();
        //name = inputObj.nextLine();
        System.out.println("Take name: ");
        name = inputObj.next();

        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
        System.out.println("name = " + name);


    }
}