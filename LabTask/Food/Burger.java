import java.lang.*;

public class Burger extends Food 
{
    private int numberOfPatty;
    private Food food;

    public Burger()
    {
        System.out.println("Your burger is being prepared...");
    }
    public Burger (String name, String[] ingredients, double price, float calories, int numberOfPatty)
    {
        super (name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    public void setFood(Food food){this.food = food;}
    public void setNumberOfPatty (int numberOfPatty){this.numberOfPatty = numberOfPatty;}
    
    public int getNumberOfPatty (){return numberOfPatty;}

    public void showDetails ()
    {
        food.showDetails();
        System.out.println("You have ordered a burger with " + numberOfPatty + " patties.");
        System.out.println();
    }
}