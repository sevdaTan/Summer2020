package day19_Loops;

import com.sun.codemodel.internal.JForEach;

import javax.swing.*;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // palindrome ==> level tersten okunusu ==> level
//kendim yapamadim :(

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = input.nextLine();
        int length = word.length() / 2;
        int countTrue=0;
        for (int i = 0; i < length; i++) {
            if (word.charAt(i) == word.charAt(word.length() - (i + 1))) {
                countTrue++;
            }
        }
        if(countTrue==length){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        System.out.println("**************");


    }
}
