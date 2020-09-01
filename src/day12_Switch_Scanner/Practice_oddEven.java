package day12_Switch_Scanner;

import java.util.Scanner;

public class Practice_oddEven {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = keyb.nextInt();

        String r = (number % 2 == 0) ? "It is an even number "
             : "it is an odd number";
        System.out.println(r);

    }


}
