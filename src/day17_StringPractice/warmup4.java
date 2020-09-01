package day17_StringPractice;

import java.util.Scanner;

public class warmup4 {
    /*
  4. write a program that asks user's first and last name, then prints out the initials of the user

                input:
                    cybertek
                    batch18

                output:
                    your initial is: CB

        DO NOT use charAt method
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scan.next();
        System.out.println("Enter your last name: ");
        String lastName = scan.next();

        /*char ch1 = firstName.charAt(0);
        char ch2 = lastName.charAt(0);
        String initials = (""+ch1+ch2).toUpperCase();
        String initials = ""+ch1+ch2;
        initials = initials.toUpperCase();  */

        String initials = firstName.substring(0,1) + lastName.substring(0,1);
        initials = initials.toUpperCase();

        System.out.println(initials);







    }



}
