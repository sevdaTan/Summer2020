package day15_String;

import java.util.Scanner;

public class upperCase_practice {

    public static void main(String[] args) {

        String schoolName = "Cybertek";
        schoolName = schoolName.toUpperCase();
        System.out.println(schoolName);

        System.out.println("==========");

     Scanner keyb = new Scanner(System.in);
        System.out.println("Enter your fullname: ");
        String fullname = keyb.nextLine();
        fullname = fullname.toUpperCase();
        System.out.println(fullname);

        System.out.println("===========");

    }
}
