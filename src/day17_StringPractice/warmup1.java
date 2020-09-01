package day17_StringPractice;

import java.util.Scanner;

public class warmup1 {
    /*
    1. Ask user to enter a word. If the work contains
    starts with x, print the word without x.

					Input:
						xcode

					Output:
						code    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        if (word.startsWith("x")){
            System.out.println(word.substring(1));
        }





    }
}
