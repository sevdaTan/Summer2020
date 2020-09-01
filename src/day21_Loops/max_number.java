package day21_Loops;

import java.util.Scanner;

public class max_number {
    public static void main(String[] args) {

/*
1. write a program that asks
user to enter 5 numbers and returns the
 maximum number
*/
        Scanner scan = new Scanner(System.in);

       int maxNum = -2147483648;

        for(int i = 10; i <= 50; i +=10) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num > maxNum) {
                maxNum = num;
            }

        }

            System.out.println("Your maximum number is: "+maxNum);










    }
}
