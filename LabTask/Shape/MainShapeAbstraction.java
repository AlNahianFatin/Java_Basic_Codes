public class MainShapeAbstraction{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setDim1(7.5);
        r1.setDim2(2.9);
        System.out.println("The length is set as length = " + r1.getDim1());
        System.out.println("The width is set as width = " + r1.getDim2());
        System.out.println("The area of the rectangle is : " + r1.getDim1()*r1.getDim2());

        Triangle t1 = new Triangle(1.3, 5.1);
        System.out.println("The base is set as base = " + t1.getDim1());
        System.out.println("The height is set as height = " + t1.getDim2());
        t1.displayArea();

        Circle c1 = new Circle();
        c1.setParameter(8.8);
        System.out.println("The radius is set as radius = " + c1.getParameter());
        System.out.println("The area of the triangle is : " + 3.1416*c1.getParameter());
    }
}
