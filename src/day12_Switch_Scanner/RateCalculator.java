package day12_Switch_Scanner;

import java.util.Scanner;

public class RateCalculator {
    /*
    write a program for the rate calculator
            1. asks the user to enter the salary (as double)
            2. asks the user how many hours does he/she works in a week (as int)
            3. print the hourly rate of the employee
            assume that one year has 52 weeks
            hourRate = salary/ (weeklyHour * 52)
     */
    public static void main(String[] args) {

        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter your salary: ");
        double salary = keyb.nextDouble();

        System.out.println("How many hours do you work in a week?");
        int weeklyHour = keyb.nextInt();

        int total_hours =weeklyHour * 52;
        double hourlyRate = salary / total_hours;

        System.out.println("Your hourly rate is: $"+hourlyRate);




    }
}
