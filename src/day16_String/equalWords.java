package day16_String;

import java.util.Scanner;

public class equalWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String first = scan.next();

        System.out.println("Enter second word: ");
        String second = scan.next();

        String result =  (first.equalsIgnoreCase(second)) ? "Equal" : "Not Equal" ;

        System.out.println(result);

        }

    }

