package day17_StringPractice;

import java.util.Scanner;

public class p {


    /*Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s).
    If x is the third letter it should be printed. If the first and second are x, both should be ignored.*/

        public static void main(String[] args) {
            Scanner scan =new Scanner(System.in);
            System.out.println("Enter a word");
            String word =scan.nextLine();
            char firstLetter=word.charAt(0);
            char secondletter=word.charAt(1);
            char thirthLetter=word.charAt(2);
            String  a=word.substring(2,word.length());
            String b=word.substring(0,1);
            if(firstLetter=='x'&& secondletter=='x'){
                System.out.println(word.substring(2));
            }else if(firstLetter!='x'&&secondletter!='x'&&thirthLetter=='x'){
                System.out.println(word);
            }else if(secondletter=='x'){
                System.out.println(b.concat(a));
            }else{
                System.out.println(word);
            }

        }

    }
