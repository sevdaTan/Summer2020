package day09_IfStatements;

public class min_number {
    /*
    write a java program that accepts 3
    numbers and return min. number
     */
    public static void main(String[] args) {


    int a = 119;
    int b = 82;
    int c = 65;

    /*    if (a < b && a < c){
        System.out.println("a is the minimum number");
    }
        if (b < a && b < c) {
        System.out.println("b is the minimum number");
    }
        if (c < a && c < b) {
        System.out.println("c is the minimum number");
    }

     */

        boolean aMinNum = (a < b && a < c);
        boolean bMinNum = (aMinNum == false && b < c);
                          //(!aMinNum  && b < c)
        boolean cMinNum = (!(aMinNum && bMinNum) );

        int min = 0;
        if (aMinNum){
            min = a;
        }
        if (bMinNum){
            min = b;
        }
        if (cMinNum){
            min = c;
        }
        System.out.println(min + " is the minimum number" );




    }



}
