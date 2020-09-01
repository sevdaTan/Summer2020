package day16_String;

import java.util.Scanner;

public class warmupTasks {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

       /*
        Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
        */
        System.out.println("Enter your first word: ");
        String firstWord = keyb.next();
        System.out.println("Enter your second word: ");
        String secondWord = keyb.next();


        //String result = firstWord.substring(1).concat(secondWord.substring(1));
        String result = firstWord.substring(1) + secondWord.substring(1);
        System.out.println(result);

        System.out.println("===============");

        /* 2. Ask user to enter a word. Print true is the first and last characters
         of the string are same characters, print false otherwise.
            Input:
                abba
            Output:
                true
         */

        //First-Last characters

        System.out.println("Enter a word:");
        String word = keyb.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);
        System.out.println(firstChar == lastChar);
        /*if (firstChar == lastChar){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        */



        System.out.println("==========");

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        System.out.println(drink);
        String action  = str.substring(10,14 - 1);
        System.out.println(action);





        System.out.println("============");





    }




}
