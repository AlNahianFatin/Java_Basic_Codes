import java.lang.*;
public class Drinks extends Food {
    String type;
    int sizeInLitter;

    Drinks() {
    }

    Drinks (String name, String[] ingredients, double price, float calories, String type, int sizeInLitter) {
        super(name, ingredients, price, calories);
        this.type = type;
        this.sizeInLitter = sizeInLitter;
    }

    void setType(String type) {
        this.type = type;
    }

    void setSize(int sizeInLitter) {
        this.sizeInLitter = sizeInLitter;
    }

    String getType() {
        return type;
    }

    int getSize() {

        return sizeInLitter;
    }
}