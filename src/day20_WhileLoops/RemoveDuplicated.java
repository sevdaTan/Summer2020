package day20_WhileLoops;

import java.util.Scanner;

public class RemoveDuplicated {
    public static void main(String[] args) {

/*
write a program that can remove duplicates
from any given String
 */
Scanner s = new Scanner(System.in);
        System.out.println("Enter a word: ");
String str = s.nextLine();
String result = "";

for (int i =0; i <= str.length()-1; i++){
    String st = ""+ str.charAt(i);
    if (!result.contains(st)){ // if the character is
                          // already contained in result,
                         // we will not add it.
        result += st; // continue; da kullanilabilir burada
    }

}
        System.out.println(result);












        /*
       Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String result ="";
        for(int i = 0; i< str.length();i++) {
            if (i != str.length() - 1) {
                if (str.substring(i,i+1).equals(str.substring(i+1,i+2))) {
                    continue;
                }
                result += str.substring(i,i+1);
            }else{
                result += str.substring(i,i+1);
            }
        }
        System.out.println(result);
    }

         */
    }
}
