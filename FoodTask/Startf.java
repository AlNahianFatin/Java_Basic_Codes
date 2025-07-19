import java.lang.*;
public class Startf {
    public static void main(String[] args) {
        
        Drinks coke = new Drinks ("Coke", new String[]{"Water", "Sugar", "Caramel"}, 1.99, 140, "Soda", 0.5);
        Burger cheeseBurger = new Burger("Cheeseburger", new String[]{"Beef patty", "Cheese", "Bun"}, 4.99, 600, 1);
        Pizza pepperoniPizza = new Pizza("Pepperoni Pizza", new String[]{"Dough", "Tomato Sauce", "Pepperoni"}, 12.99, 800, 16);

        coke.showDetails();
        System.out.println("Type: " + coke.getType());
        System.out.println("Size in Liters: " + coke.getSize() + " L");

        cheeseBurger.showDetails();
        System.out.println("Number of Patty: " + cheeseBurger.getNumberOfPatty());

        pepperoniPizza.showDetails();
        System.out.println("Size in Inches: " + pepperoniPizza.getSize() + " inches");
    }
}