package day19_Loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // write a program that reverse any string
        System.out.println("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String reverseName = "";
        for (int i = name.length()-1; i >=0 ; i--) {
            reverseName = reverseName + name.charAt(i);
        }
        System.out.print(reverseName);

        System.out.println();
        System.out.println("**********");

        String str ="Cybertek is cool"; //rebyC
        int leng = str.length()-1;
        String result ="";
        for (int i = leng; i >= 0; i--){
            result += str.charAt(i);
        }
        System.out.println(result);
    }
}
