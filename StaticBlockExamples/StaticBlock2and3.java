public class StaticBlock2and3  
{  
  
// Constructor of the class StaticBlock2and3  
StaticBlock2and3()   
{  
System.out.println("Inside the constructor of the class.");  
}  
  
public static void foo()  
{  
System.out.println("Inside the method foo.");     
}  
  
  
static int st = 9;  
  
// static block  
static  
{  
foo();  
System.out.println(st);  
System.out.println("Inside the static block. - 1");   
}  
  
// main method  
public static void main(String[] args)   
{  
  
// instantiating the class StaticBlock2and3  
StaticBlock2and3 sbObj = new StaticBlock2and3();  
  
  
}  
}  