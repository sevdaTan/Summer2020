package day14_Recap;

import java.util.Scanner;

public class numOfdays {
    /*
    4. Write a program that asks user to enter the month number and returns the
    number of days in given month month (Assume that Feb has 28 days)

				30 days: 4,6,9,11
				31 days: 1,3,5,7,8,10,12
     */
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter a number between 1-12:");
        int num = keyb.nextInt();

        if(num >= 1 && num <= 12){
            if(num == 1){
                System.out.println("January");
            }else if(num == 2){
                System.out.println("February");
            }else if(num == 3){
                System.out.println("March");
            }else if(num == 4){
                System.out.println("April");
            }else if(num == 5){
                System.out.println("May");
            }else if(num == 6){
                 System.out.println("June");
            }else if(num == 7){
                 System.out.println("July");
            }else if(num == 8){
                System.out.println("August");
            }else if(num == 9){
                System.out.println("September");
            }else if(num == 10){
                System.out.println("October");
            }else if(num == 11){
                System.out.println("November");
            }else{
                System.out.println("December");
            }
             }else{
            System.out.println("invalid number");
             }

    }
}
