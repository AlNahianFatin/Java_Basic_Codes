public class patternDiamond {
    public static void main(String args[]){
        //upper half
        for(int i = 1; i <= 4; i++){
            //spaces
            for(int j = 1; j <= 4 - i; j++){
                System.out.print("  ");
            }
            //left half of the upper half 
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //right half of the upper half & it is starting from 2 bcz on the top, only 1 * is needed to be printed & the later *s will automatically be adjusted
            for(int j = 2; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower half started from 3 bcz the middle row has to be longest & we r gonna print from its next less lengthy row (4-1)
        for(int i = 3; i >= 1; i--){
            //spaces' upper limit is 4-i bcz the longest row has 4 (left side; starting from 1 to 4) + 3 (right side; as right side started from 2 to 4) & its next less lengthy column with spaces + *s has to match its total length to create perfect shape 
            for(int j = 1; j <= 4 - i; j++){
                System.out.print("  ");
            }
            //left half of the lower half
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            //j's upper limit i-1, bcz downward, it needs to print 1 less star than i as middle column's * has already been printed from lower left side loop
            for(int j = 1; j <= i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}