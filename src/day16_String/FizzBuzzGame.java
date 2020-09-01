package day16_String;

import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {
/*
1. Write a program StartEndWords:
    you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
        if either one not 5 chars length:    print "need to be exactly 5 chars length"
        if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
        if they do not match:  print "Buzz - did not match"

		NOTE: you will need nested If
 */

Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 =  scan.next();

        System.out.println("Enter your second word");
        String word2 =  scan.next();

        boolean result = word1.length() == 5 && word2.length() == 5;
if (result){
    char ch1 = word1.charAt(word1.length() - 1);//last character of the first word
    char ch2 = word2.charAt(word1.length() - 1);//last character of the second word

    if (ch1 == ch2){
        System.out.println("Fizz");
    }else{
        System.out.println("Buzz");
    }



   }else{
    System.out.println("Need to be exactly 5 chars length!");

  }











    }
}
