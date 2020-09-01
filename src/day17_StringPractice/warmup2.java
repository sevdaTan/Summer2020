package day17_StringPractice;

import java.util.Scanner;

public class warmup2 {
    /*
    2. Ask user to enter a word. If the first
    or second or both letter of the word is x,
    print the word without x(s). If x is the
    third letter it should be printed. If the
    first and second are x, both should be ignored.

					Input:
						xxode

					Output:
						ode

					Input:
						oxidex
					Output:
						oidex
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.next();

        boolean firstX =word.charAt(0)=='x';
        boolean secondX = word.charAt(1)=='x';
        if(firstX && secondX){
            System.out.println(word.substring(2));
        }else if (firstX ){
            System.out.println(word.substring(1));
        }else if(secondX){
            System.out.println(word.substring(0,1) + (word.substring(2)));
        }else{
            System.out.println(word);
        }



    }
}
