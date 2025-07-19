import java.lang.*;
public class Food {
    String name;
    String[] ingredients;
    double price;
    float calories;

    Food() {
    }

    Food(String name, String[] ingredients, double price, float calories) {
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.calories = calories;
    }

    void setName(String name) {
        this.name = name;
    }

    void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setCalories(float calories) {
        this.calories = calories;
    }

    String getName() {
        return name;
    }

    String[] getIngredients() {
        return ingredients;
    }

    double getPrice() {
        return price;
    }

    float getCalories() {
        return calories;
    }

    void removeIngredient(String ingredient) {
       
    }

    void addIngredient(String ingredient) {
       
    }

    void showDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Ingredients: " + String.join(", ", ingredients));
        System.out.println("Price: $" + price);
        System.out.println("Calories: " + calories + " cal");
    }
}