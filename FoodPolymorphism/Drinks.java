import java.lang.*;

public class Drinks extends Food
{
    public String Type;
    public int sizeInLitter;
    public Food food;

    static{System.out.println("Your drinks is being prepared...");}
    
    public Drinks(){}
    public Drinks (String name, String[] ingredients, double price, float calories, String type, int sizeInLitter){
        super (name, ingredients, price, calories);
        Type = type;
        this.sizeInLitter = sizeInLitter;
    }

    public void setFood(Food food){this.food = food;}
    public void setType (String type){Type = type;}
    public void setSize(int sizeInLitter){this.sizeInLitter = sizeInLitter;}
    
    public Food getFood(){return food;}
    public String getType (){return Type;}
    public int getSize (){return sizeInLitter;}

    @Override
    public void showDetails (){
        System.out.println("Your food : " + name);
        System.out.println("Your selected ingredients : " + ingredients);
        System.out.println("Price : " + price);
        System.out.println("Total calories : " + calories);
        System.out.println("You want it to be : " + Type );
        System.out.println("You want " + sizeInLitter + " liter(s).");
        System.out.println();
    }
}