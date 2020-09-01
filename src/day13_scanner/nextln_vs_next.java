package day13_scanner;

import java.util.Scanner;

public class nextln_vs_next {
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = keyb.nextDouble();
        keyb.nextLine();//we useit to take out the enters that are left in scanner.
        // int, double gibi declare edilmis
        // variable dan sonra nextLine gelirse oncesinde
        // keyb.nextLine(); yazmamiz gerekiyor

        System.out.println("Enter your full name: ");
        String fullname = keyb.nextLine();

        System.out.println("Salary: "+ salary);
        System.out.println("Full name: "+fullname);




    }
}
