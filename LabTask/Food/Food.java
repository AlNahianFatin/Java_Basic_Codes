import java.lang.*;

public class Food
{
    private String name;
    private String[] ingredients;
    private double price;
    private float calories;

    public Food()
    {
        System.out.println("Your food is being prepared...");
    }
    public Food(String name, String[] ingredients, double price, float calories)
    {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    public void setName(String name){this.name = name;}
    public void setIngredients (String ingredients[]){this.ingredients = ingredients;}
    public void setPrice(double price){this.price = price;}
    public void setCalories (float calories){this.calories = calories;}
    
    public String getName(){return name;}
    public String[] getIngredients(){return ingredients;}
    public double getPrice(){return price;}
    public float getCalories(){return calories;}

    public void removeIngredient(String ingredient)
    {
        System.out.println("Please remove " + ingredient + ". It is not so good for your health.");
    }
    public void addingredient(String ingredient)
    {
        System.out.println("Instead, you may add " + ingredient + " to your menu.");
        System.out.println();
    }
    public void showDetails()
    {
        System.out.println("Your food : " + name);
        System.out.println("Your selected ingredients : " + ingredients);
        System.out.println("Total bill : " + price);
        System.out.println("Total calories : " + calories);
    }
}