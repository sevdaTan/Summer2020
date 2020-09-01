package day21_Loops;

import java.util.Scanner;

public class min_number {
    public static void main(String[] args) {
   /*
   2. write a program that asks user
    to enter 5 numbers and returns the
     minimum number
   */
        Scanner scan = new Scanner(System.in);

        int minNum = 1000000000;

        for(int i = 0; i <= 5; i +=1) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num < minNum) {
                minNum = num;
            }

        }

        System.out.println("Your minimum number is: "+minNum);





    }
}
