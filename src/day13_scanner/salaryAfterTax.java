package day13_scanner;

import java.util.Scanner;

public class salaryAfterTax {
    /*
    write a program that can calculate the state tax, federal tax and salary after tax
				needed information:
								annual salary
								state tax rate
								federal tax rate
     */
    public static void main(String[] args) {

        Scanner keyb = new Scanner (System.in);

        System.out.println("Enter your annual salary: ");
        double salary = keyb.nextDouble();
        System.out.println("Enter your state tax rate: ");
        double s_Tax = keyb.nextDouble();
        double stateTax = salary * s_Tax;
        System.out.println("Enter the federal tax rate:");
        double f_Tax = keyb.nextDouble();
        double federalTax = salary * f_Tax;
        double totalTax = (stateTax + federalTax);
        double Total_salary = salary - totalTax;

        System.out.println("Your annual salary is: $"+salary);
        System.out.println("Your state tax is: $"+stateTax);
        System.out.println("Your federal tax is: $"+federalTax);
        System.out.println("Your total salary is $"+ Total_salary);

        System.out.println("===================");



    }
}
