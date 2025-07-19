import java.lang.*;

public class Restaurant {
    public String restaurantName;
    public Food foods [];
    //public String addOrder[]; 
    public Food removeOrder[];
    public double sum = 0;

    static{System.out.println("Welcome Dear Food Lover!" );}
    public Restaurant(){}
    public Restaurant(String restaurantName){
        this.restaurantName = restaurantName;
        System.out.println("We humbly welcome you to our restaurant " + restaurantName + "!");
        System.out.println();
    }

    public void setRestaurantName(String restaurantName){
        this.restaurantName = restaurantName;
        System.out.println("We humbly welcome you to our restaurant " + restaurantName + "!");
}
    
    public String getRestaurantName(){return restaurantName;}
    
    public void addToOrder(Food f[]){
        for (int i = 0; i < 15; i++){
            foods[i] = f[i];
        }
    }
    
    public void removeFromOrder (Food f[]){
        for (int i = 0; i < 15; i++){
            removeOrder[i] = f[i];
        }
    }
    
    public void showOrders(){
        System.out.println("Your final order: ");
        for(int i = 0; i < 15; i++){
            for(int j = 0; j < 15; j++){
                if(foods[i].equals(removeOrder[j])){
                    int indexToClear = i;
                    foods[indexToClear] = null;
                }
                else{
                    System.out.println(foods[i]);
                }
            }
        }
    }
    
    /*public double calculateBill(){
        sum += price;
        return sum;
    }*/
}
