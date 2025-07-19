public class StaticBlock   
{  
  
// Constructor of the class StaticBlock  
StaticBlock()   
{  
System.out.println("Inside the constructor of the class.");  
}  
  
// print method of the StaticBlock class  
public static void print()   
{  
System.out.println("Inside the print method.");  
}  
  
static  
{  
System.out.println("Inside the static block.");   
}  
  
// main method  
public static void main(String[] args)   
{  
  
// instantiating the class StaticBlock  
StaticBlock sbObj = new StaticBlock();  
sbObj.print(); // invoking the print() method  
  
// invoking the constructor inside the main() method  
new StaticBlock();  
  
}  
}  