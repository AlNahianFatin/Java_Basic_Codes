public class patternDiamond2 {
    public static void main(String args[]){
        //upper half
        for(int i = 1; i <= 4; i++){
            //spaces
            for(int j = 1; j <= 4 - i; j++){
                System.out.print("  ");
            }
            //upper half stars
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("* ");
            }
            System.err.println();
        }
        //lower half
        for(int i = 3; i >= 1; i--){
            //spaces
            for(int j = 1; j <= 4 - i; j++){
                System.out.print("  ");
            }
            //lower half stars
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}