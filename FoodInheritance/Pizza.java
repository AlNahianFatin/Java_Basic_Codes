import java.lang.*;

public class Pizza extends Food 
{
    private int sizeInInches;
    private Food food;

    static
    {
        System.out.println("Your pizza is being prepared...");

    }
    
    public Pizza()
    {

    }
    public Pizza (String name, String[] ingredients, double price, float calories, int sizeInInches)
    {
        super (name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setFood(Food food){this.food = food;}
    public void setSize (int sizeInInches){this.sizeInInches = sizeInInches;}
    
    public int getSize (){return sizeInInches;}

    public void showDetails ()
    {
        food.showDetails();
        System.out.println("You have ordered a pizza of " + sizeInInches + " inches.");
        System.out.println();
    }
}