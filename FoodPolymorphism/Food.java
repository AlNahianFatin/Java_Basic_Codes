import java.lang.*;

public abstract class Food
{
    public String name;
    public String[] ingredients;
    public double price;
    public float calories;

    static{System.out.println("Your food is being prepared...");}
    
    public Food(){}
    public Food(String name, String[] ingredients, double price, float calories){
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

    public void removeIngredient(String ingredient){
        System.out.println("Please remove " + ingredient + ". It is not so good for your health.");
    }
    public void addingredient(String ingredient){
        System.out.println("Instead, you may add " + ingredient + " to your menu.");
        System.out.println();
    }
    public abstract void showDetails();
}