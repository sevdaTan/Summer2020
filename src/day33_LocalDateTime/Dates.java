package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {

        LocalDate DOB = LocalDate.of(1984,03,26);
        // year - month - day

        System.out.println(DOB);

        System.out.println("===========");

        LocalDate today = LocalDate.now(); // now method = gets the current date
        System.out.println(today);

        System.out.println("===========");


        LocalDate y = LocalDate.of(2020,1,1);
        boolean result = y.isLeapYear();
        System.out.println(result);

        System.out.println("===========");

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter a year:");
        int year = scan.nextInt();
        boolean result2 = LocalDate.of(year,1,1).isLeapYear();
        System.out.println(result2);

        System.out.println("===========");

        Scanner scan1  = new Scanner(System.in);
        System.out.println("Enter the birth year, birth month, birth day:");
       LocalDate birthdate = LocalDate.of( scan1.nextInt(), scan1.nextInt(), scan1.nextInt());
        System.out.println(birthdate);
        System.out.println(birthdate.isLeapYear());


    }
}
