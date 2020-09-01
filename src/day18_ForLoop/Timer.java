package day18_ForLoop;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args)throws Exception {

       Scanner scan = new Scanner(System.in);
       System.out.println("please enter the number of minuts: ");
        int minutes = scan.nextInt();

        for (int i = minutes;  i > 0; --i ){
            if (i < 0 )
                break;
            for (int  z = 59; z >= 0; --z) {
                System.out.println((i - 1)+ " minutes and "+ z + "seconds left");
           Thread.sleep(1000);

            }
        }
        System.out.println("\n \t ***************************************************");
        System.out.println("  \t \t ***                                          *** ");
        System.out.println("   \t \t  ***  Time is up, Please take your seats!  ***");
        System.out.println("    \t \t   ***                                   *** ");
        System.out.println("      \t \t     ************************************");
        System.out.println(minutes);
    }
}
