package day15_String;

import java.util.Scanner;

public class Char_practice {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String first_name = keyb.next();
        char ch1 = first_name.charAt(0);
        System.out.println("Enter your last name: ");
        String last_name = keyb.next();
        char ch2 = last_name.charAt(0);
        System.out.println("Your initial is: "+ch1 + ch2);

    }
}
