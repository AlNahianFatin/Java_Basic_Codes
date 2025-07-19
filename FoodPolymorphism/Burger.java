import java.lang.*;

public class Burger extends Food 
{
    public int numberOfPatty;
    public Food food;

    static{System.out.println("Your burger is being prepared...");}

    public Burger(){}
    public Burger (String name, String[] ingredients, double price, float calories, int numberOfPatty){
        super (name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setFood(Food food){this.food = food;}
    public void setNumberOfPatty (int numberOfPatty){this.numberOfPatty = numberOfPatty;}
    
    public Food getFood(){return food;}
    public int getNumberOfPatty (){return numberOfPatty;}

    @Override
    public void showDetails (){
        System.out.println("Your food : " + name);
        System.out.println("Your selected ingredients : " + ingredients);
        System.out.println("Price : " + price);
        System.out.println("Total calories : " + calories);
        System.out.println("You have ordered a burger with " + numberOfPatty + " patties.");
        System.out.println();
    }
}