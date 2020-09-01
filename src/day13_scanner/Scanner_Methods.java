package day13_scanner;

import java.util.Scanner;

public class Scanner_Methods {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Your car has 4 doors");
        boolean result = scan.hasNextBoolean();

        System.out.println(result);

        System.out.println("==============");



    }
}
