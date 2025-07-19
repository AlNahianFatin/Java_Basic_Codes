import java.lang.*;
public class Pizza extends Food {
    int sizelnInches;

    Pizza() {
    }

    Pizza(String name, String[] ingredients, double price, float calories, int sizeInInches) {
        super(name, ingredients, price, calories);
        this.sizelnInches = sizeInInches;
    }

    void setSize(int sizeInInches) {
        this.sizelnInches = sizeInInches;
    }

    int getSize() {
        return sizelnInches;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("Size in Inches: " + sizelnInches + " inches");
    }
}