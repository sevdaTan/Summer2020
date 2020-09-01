package day13_scanner;

import java.util.Scanner;

public class Scanner_next {

    public static void main(String[] args) {
//next() ==>  sadece ilk kelime cikiyor enter a basinca
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter your company name: ");
        String companyName = keyb.next();

        System.out.println("Your company name: "+ companyName);
        keyb.next();

        System.out.println("================");

        System.out.println("Enter your first name:");
        String firstname = keyb.next();
        System.out.println("Your name is: "+ firstname);
        keyb.next();
        System.out.println("Enter your gender: ");
        String gender = keyb.next();
        System.out.println("Your gender is: "+gender);
        System.out.println("Enter your name and surname: ");
        String fullname= keyb.next();
        System.out.println("Your full name is: "+ fullname);
        keyb.next();

    }

}
