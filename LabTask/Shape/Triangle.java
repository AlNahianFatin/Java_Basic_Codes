public class Triangle extends Shape{
    public double base, height;

    public Triangle(){System.out.println("Triangle : ");}

    public Triangle(double base, double height){
        super(base, height);
        System.out.println("\nWe are now calculating area of a special shape Triangle : ");
    }

    public void setParameters(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    public void displayArea(){
        System.out.println("The area of the triangle is : " + 0.5*dim1*dim2);
    }
}
