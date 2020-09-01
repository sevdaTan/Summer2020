package day12_Switch_Scanner;

import java.util.Scanner;

public class sumOfTwoNumbers {
/*
 write a program that can ask user to enter two number, and the prints the sum of those two number
            Enter your first number
            10
            Enter your second number
            20
          sum = 30
 */
    public static void main(String[] args) {

        Scanner keyb = new Scanner (System.in);
        System.out.println("Enter your first number:");
        int num1 = keyb.nextInt();

        System.out.println("Enter your second number: ");
        int num2 = keyb.nextInt();

        System.out.println("The sum of two numbers is :"+ (num1 + num2));



    }


}
