public class stringAndIncrementExample{
    private int x;
    public static int y = 5;
    public stringAndIncrementExample(){
        System.out.println("Don't worry!");
        y++;}
        public stringAndIncrementExample(int x){
            this.x = x;
            System.out.println("Programming is fun!");
            y+=2;
        }
        public void setX(int x){this.x = x;}
        public void setY(int y){y = y;}
        public void display(){
            System.out.println("x: "+ x + ", y: "+y);
        }
        public static void main(String args[]){
            stringAndIncrementExample obj = new stringAndIncrementExample();
            stringAndIncrementExample obj1 = new stringAndIncrementExample(3);
            String s1="Don't loose hope!";
            String s2= new String("Stay");
            String s3 = new String("focused");
            String s4 = "Keep practicing";
            String s5 = new String();
            String s6 = "Stay";
            System.out.println(s6.isEmpty());
            System.out.println(s2.concat(" "+ s3));
            System.out.println(s4);
            System.out.println(s1.substring(6,11) + s3);
            if(s2 == s6){
                obj1.setX(--obj.x);
                obj1.display();
            } 
            else{
                obj1.setX(++obj.x);
                obj1.display();
            }
            if(s2.equals(s5)){
                obj1.setX(--obj.x);
                obj1.display();
            }
            else{
                obj1.setX(++obj.x);
                obj1.display();
            }
            s5 = s1.substring(6,16);
            System.out.println(s5);
            System.out.println((int)s3.charAt(0));
            if(s1.compareTo(s4) < 0){
                obj1.setY(--stringAndIncrementExample.y);
                System.out.println("smaller");
            }
            else{
                obj1.setY(stringAndIncrementExample.y--);
                System.out.println("greater or equal??");
            }
            obj1.display();
            obj.display();
        }
}