package Office_Hours.practice_07_01_2020;

import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {
  /*
   3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

					Input:
						one
						eight

					Output:
						oneight
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word:");
        String str1 = scan.next();
        System.out.println("Enter first word:");
        String str2 = scan.next();

/*
char ch1 = str1.charAt(str1.length() - 1);// last char from str1
char ch2 = str2.charAt(0);// first char from str2

        if (ch1 == ch2){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1 +" "+ str2);
        }
*/
        String s1 = str1.substring(str1.length() - 1);// last char from str1
        String s2 = str2.substring(0,1);// first char from str2

        if (s1.equals(s2) ){
            System.out.println(str1 + str2.substring(1));
        }else {
            System.out.println(str1 + str2);

        }
      /*  String ch1 =""+ str1.charAt(str1.length() - 1);// last char from str1
        String ch2 =""+str2.charAt(0);// first char from str2

        if (ch1 == ch2){
            System.out.println(str1 + str2.substring(1));
        }else{
            System.out.println(str1 +" "+ str2);
        }*/
    }
}
