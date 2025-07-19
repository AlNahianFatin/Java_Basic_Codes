import java.lang.*;

public class Box0
{
	private double length;
	private double width;
	private double height;
	
	public void setLength(double l)
	{
		length = l;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getLength(){
        return length;
    }
	public double getWidth(){return width;}
	public double getHeight(){return height;}
	public static void main(String args[])	
	{
		Box0 b = new Box0();
		
		b.setLength(2.3);
		b.setWidth(1.5);
		b.setHeight(1.2);
		
		System.out.println("Length is: "+b.getLength());
		System.out.println("Width is: "+b.getWidth());
		System.out.println("Height is: "+b.getHeight());
				
	}
}