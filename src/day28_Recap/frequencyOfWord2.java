package day28_Recap;

import java.util.Scanner;

public class frequencyOfWord2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        System.out.println("Enter a word: ");
        String word = scan.next();
        int l = word.length();

        int count = 0;
        for(int i = 0; i <= str.length()-l; i++){
           if(str.substring(i , i+l).equalsIgnoreCase(word)){
               count++;
           }
        }
        System.out.println(count);


    }
}
