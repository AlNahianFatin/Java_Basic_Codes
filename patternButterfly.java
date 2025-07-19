public class patternButterfly{
    public static void main(String args[]){

        //upper half
        for(int i = 1; i <= 4; i++){

            //1st part for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= 2 * (4-i); j++){
                System.out.print(" ");
            }

            //2nd part for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i = 4; i >= 1; i--){

            //1st part for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= 2 * (4-i); j++){
                System.out.print(" ");
            }
            
            //2nd part for stars
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}