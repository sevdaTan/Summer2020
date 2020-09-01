package day13_scanner;

import java.util.Scanner;

public class nextln_practice {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int building_num = keyb.nextInt();

        keyb.nextLine();

        System.out.println("Enter your street name: ");
        String Streetname = keyb.nextLine();

        System.out.println(building_num + " " + Streetname);


    }
}
