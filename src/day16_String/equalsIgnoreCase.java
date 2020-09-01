package day16_String;

import java.util.Scanner;

public class equalsIgnoreCase {
    public static void main(String[] args) {

        String s = "JAVA";
        String s1 = "java";

        System.out.println(s.equalsIgnoreCase(s1));//true
        System.out.println(s.equals(s1));//False


        /*
        ask use if she/he is employed
        if user says yes, print --> employed
        if no --> unemployed
         */
        Scanner keyb = new Scanner(System.in);
        System.out.println("Are you employed: ");
        String answer = keyb.nextLine();
       // String answer = keyb.nextLine().toLowerCase();// buyuk kucuk harf sorununu bu sekilde de cozebiliriz

        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Employed");
        }else{
            System.out.println("Not Employed");
        }





    }
}
