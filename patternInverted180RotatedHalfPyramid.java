public class patternInverted180RotatedHalfPyramid{
    public static void main(String[] args){

        //for outer loop
        for(int i = 1; i <= 4; i++){

            //for inner loop -> spaces
            for(int j = 1; j <= 4-i; j++){
                System.out.print("  ");
            }

            //for inner loop -> stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}