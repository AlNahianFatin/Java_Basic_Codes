import java.lang.*;

public class Start {
    public static void main(String[] args)
    {
        Restaurant restaurant = new Restaurant("The Foodies Delight");

        Food foods [] = new Food[100];

        Drinks[] d = new Drinks[5];
        String ingredientsd1[] = new String[] {"Lemon ", "Water ", "Sugar ", "Ice cubes"};
        foods[0] = new Drinks("Lemonade", ingredientsd1, 40, 40, "Cold", 1);
        foods[0].showDetails();
        foods[0].removeIngredient("Ice cubes");
        foods[0].addingredient("Cold water");

        Burger[] b = new Burger[5];
        String ingredientsb2[] = new String[] {"Bun ", "Cheese Slices ", "Tomato Ketchup ", "Mayonese "};
        foods[1] = new Burger ("Cheese Burger", ingredientsb2, 119.99, 145, 3);   
        foods[1].showDetails();
        foods[1].removeIngredient("Mayonese");
        foods[1].addingredient("Cucumber");

        Pizza[] p = new Pizza[5];
        String ingredientsp2[] = new String[] {"Chicken ", "Capsicum ", "Mayonese ", "Sausage "};
        foods[2] = new Pizza ("Mexican Pizza", ingredientsp2, 409.99, 137, 14);    
        foods[2].showDetails();
        foods[2].removeIngredient("Mayonese");
        foods[2].addingredient("Tomato ketchup");
    }
}
