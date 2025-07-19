public class Rectangle extends Shape{
    public double length, width;

    public Rectangle(){System.out.println("Rectangle : ");}

    public Rectangle(double length, double width){
        super(length, width);
    }

    public void setParameters(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public void displayArea(){
        System.out.println("The area of the rectangle is : " + dim1*dim2);
    }
}