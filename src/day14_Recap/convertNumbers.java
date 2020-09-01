package day14_Recap;

import java.util.Scanner;

public class convertNumbers {
    /*
    1. write a java program that can convert any given
     numbers between 0 ~ 9 to words, if the number is greater
     than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and nested IF

     */
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a number between 0 - 9: ");
        int number = keyb.nextInt();

        if (number >= 0 && number <= 9){
            if (number == 0) {
                System.out.println("Zero");
            }else  if (number == 1) {
                System.out.println("One");
            }else  if (number == 2) {
                System.out.println("Two");
            }else if (number == 3) {
                System.out.println("Three");
            }else  if (number == 4) {
                System.out.println("Five");
            }else  if (number == 6) {
                System.out.println("Six");
            }else if (number == 7) {
                System.out.println("Seven");
            }else  if (number == 8) {
                System.out.println("Eight");
            }else{
                System.out.println("Nine");
            }
        }else{
            System.out.println("Invalid");
        }







    }




}
