import java.lang.*;
public class Burger extends Food {
    int numberOfPatty;

    Burger() {
    }

    Burger(String name, String[] ingredients, double price, float calories, int numberOfPatty) {
        super(name, ingredients, price, calories);
        this.numberOfPatty = numberOfPatty;
    }

    void setNumberOfPatty(int numberOfPatty) {
        this.numberOfPatty = numberOfPatty;
    }

    int getNumberOfPatty() {

        return numberOfPatty;
    }

    void showDetails() {

        super.showDetails();
        
        System.out.println("Number of Patty: " + numberOfPatty);
    }
}
