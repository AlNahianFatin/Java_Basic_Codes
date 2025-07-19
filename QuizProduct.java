import java.lang.*;
public class QuizProduct {
    public QuizProduct(){
        System.out.println("Buy");
    }
    public void display(String str){
        System.out.println(str);
        System.out.println("Shop");
    }
}

public class FoodProduct {
    static{ System.out.println("Welcomes you!");}
    public FoodProduct(){
        display("Food Food");
    }
    public void show(){
        display("Healthy Food");
    }
}

public class QuizProduct{
    public static void main(String []args){
        System.out.println("Our store ");
        FoodProduct f1 = new FoodProduct();
        f1.show();
        FoodProduct f2 = new FoodProduct();
    }
} 