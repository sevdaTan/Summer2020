package day09_IfStatements;

public class median_number {

    /*
   write a java program that accepts 3
   numbers and return median number
    */
    public static void main(String[] args) {


        int a = 119;
        int b = 82;
        int c = 65;

        /*
        if (a < b && a > c || a > b){
            System.out.println("a is the median number");
        }
        if (b < a && b > c || b > a && b < c) {
            System.out.println("b is the median number");
        }
        if (c < a && c > b || c > a && c < b) {
            System.out.println("c is the median number");
        }
       */

        boolean aMed = (a > b && a < c) || (a < b && a > c);
        boolean bMed = (b > c && b < a) || (b < c && b > a);
        boolean cMed = !aMed && ! bMed;

        int med = 0;

        if (aMed){
            med = a;
        }
        if (bMed){
            med = b;
        }
        if (cMed){
            med = c;
        }

        System.out.println(med + " is median number");




    }





}
