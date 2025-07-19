import java.lang.*;

public class Start {
    public static void main(String[] args)
    {
        Food f1 = new Food();
        f1.setName("Lemonade");
        String ingredientsd1[] = {"Lemon ", "Water ", "Sugar ", "Ice cubes"};
        f1.setIngredients(ingredientsd1);
        f1.setPrice(40);
        f1.setCalories(40);
        Drinks d1 = new Drinks();
        d1.setType("Cold");
        d1.setSize(1);
        d1.setFood(f1);      
        d1.showDetails();
        d1.removeIngredient("Ice cubes");
        d1.addingredient("Cold water");

        Food f2 = new Food();
        f2.setName("Coffee");
        String ingredientsd2[] = {"Coffee beans ", "Water ", "Sugar ", "Ice cubes"};
        f2.setIngredients(ingredientsd2);
        f2.setPrice(60);
        f2.setCalories(150); 
        Drinks d2 = new Drinks ("Coffee", ingredientsd2, 120.5, 150, "Cold", 1);
        d2.setFood(f2);      
        d2.showDetails();
        d2.removeIngredient("Ice cubes");
        d2.addingredient("Milk");

        Food f3 = new Food();
        f3.setName("Beef Burger");
        String ingredientsb1[] = {"Bun ", "Beef patty ", "Tomato ", "Cucumber", "Mayonese"};
        f3.setIngredients(ingredientsb1);
        f3.setPrice(99.9);
        f3.setCalories(160);
        Burger b1 = new Burger();
        b1.setNumberOfPatty(2);
        b1.setFood(f3);      
        b1.showDetails();
        b1.removeIngredient("Mayonese");
        b1.addingredient("Tomato ketchup");

        Food f4 = new Food();
        f4.setName("Cheese Burger");
        String ingredientsb2[] = {"Bun ", "Cheese Slices ", "Tomato Ketchup ", "Mayonese "};
        f4.setIngredients(ingredientsb2);
        f4.setPrice(120.5);
        f4.setCalories(145); 
        Burger b2 = new Burger ("Cheese Burger", ingredientsd2, 120.5, 145, 3);
        b2.setFood(f4);      
        b2.showDetails();
        b2.removeIngredient("Mayonese");
        b2.addingredient("Cucumber");

        Food f5 = new Food();
        f5.setName("Pepparoni Pizza");
        String ingredientsp1[] = {"Cheese ", "Chicken ", "Capsicum ", "Mayonese "};
        f5.setIngredients(ingredientsp1);
        f5.setPrice(379.99);
        f5.setCalories(144);
        Pizza p1 = new Pizza();
        p1.setSize(10);
        p1.setFood(f5);      
        p1.showDetails();
        p1.removeIngredient("Mayonese");
        p1.addingredient("Tomato ketchup");

        Food f6 = new Food();
        f6.setName("Mexican Pizza");
        String ingredientsp2[] = {"Chicken ", "Capsicum ", "Mayonese ", "Sausage "};
        f6.setIngredients(ingredientsp2);
        f6.setPrice(409.99);
        f6.setCalories(137); 
        Pizza p2 = new Pizza ("Mexican Pizza", ingredientsp2, 409.99, 137, 14);
        p2.setFood(f6);      
        p2.showDetails();
        p2.removeIngredient("Mayonese");
        p2.addingredient("Tomato ketchup");
    }
}
