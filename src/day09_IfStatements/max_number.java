package day09_IfStatements;

public class max_number {
/*
write a program that accepts 3 numbers
and return the maximum number
 */
    public static void main(String[] args) {
      int a = 119;
      int b = 82;
      int c = 65;

        /*if (a > b && a > c){
            System.out.println(a +" is the maximum number");
        }
        if (b > a && b > c) {
            System.out.println(b + " is the maximum number");
        }
        if (c > a && c > b) {
            System.out.println(c +" is the maximum number");
        }*/

        boolean aIsMax = a > b && a > c;
        boolean bIsMax = aIsMax == false && b > c;
        boolean cIsMaximum = !aIsMax && !bIsMax;
                //aIsMax == false && bIsMax == false;


       int max = 0;// we want to assign maximum number to variable max

       if (aIsMax){
           //System.out.println(a + " is max. number");
           max = a;
       }
       if (bIsMax){
           max = b ;
       }
       if (cIsMaximum){
           max = c;
       }
        System.out.println(max + " is the maximum number");




    }

}
