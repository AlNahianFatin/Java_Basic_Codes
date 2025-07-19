import java.lang.*;

public class Pizza extends Food 
{
    public int sizeInInches;
    public Food food;

    static{System.out.println("Your pizza is being prepared...");}
    
    public Pizza(){}
    public Pizza (String name, String[] ingredients, double price, float calories, int sizeInInches){
        super (name, ingredients, price, calories);
        this.sizeInInches = sizeInInches;
    }

    public void setFood(Food food){this.food = food;}
    public void setSize (int sizeInInches){this.sizeInInches = sizeInInches;}
    
    public Food getFood(){return food;}
    public int getSize (){return sizeInInches;}

    @Override
    public void showDetails (){
        System.out.println("Your food : " + name);
        System.out.println("Your selected ingredients : " + ingredients);
        System.out.println("Price : " + price);
        System.out.println("Total calories : " + calories);
        System.out.println("You have ordered a pizza of " + sizeInInches + " inches.");
        System.out.println();
    }
}