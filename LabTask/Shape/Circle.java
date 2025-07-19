public class Circle extends Shape{
    public double radius;

    public Circle(){System.out.println("Circle : ");}

    public Circle(double radius){
        super(radius);
    }

    public void setParameter(double radius){this.radius = radius;}
    public double getParameter(){return radius;}

    public void displayArea(){
        System.out.println("The area of the circle is : " + 3.1416*radius*radius);
    }
}