public class patternPyramid{
    public static void main(String[] args){
        for(int i = 1; i <= 4; i++){
            //spaces
            for(int j = 1; j <= 4-i; j++){
                System.out.print("  ");
            }
            //left half stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //right half stars starting from 2 bcz we only want 1 * in the 1st row & as it prints *s the same number as i, it will start printing *s from the 2nd row 
            for(int j = 2; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}