package day13_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scanner_nextln {

    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);
        System.out.println("What is your name?");
        String fullname = keyb.nextLine();
        System.out.println("Your name is "+fullname);
        System.out.println("What is your address?");
        String address = keyb.nextLine();
        System.out.println("Your address is "+address);
        System.out.println("Enter your company name: ");
        String compName = keyb.nextLine();
        System.out.println("Company name: "+ compName);




    }


}
