package day15_String;

import java.util.Scanner;

public class concatenate_practice {
    public static void main(String[] args) {

        //concat(Str) = concatenation,concates given string to the string. returns string
        String schoolName = "Cybertek";
        schoolName = schoolName.concat(" School");// "Cybertek School"
        System.out.println(schoolName);

        System.out.println("============");

        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = keyb.next();
        System.out.println("Enter your last name: ");
        String lastName = keyb.next();

       String fullName = firstName.concat(" ".concat(lastName));
        System.out.println("Your full name is: ".concat(fullName));
        //System.out.println("Your full name is: " + fullName);

    }
}
