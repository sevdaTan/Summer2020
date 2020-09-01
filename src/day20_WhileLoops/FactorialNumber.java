package day20_WhileLoops;

import java.util.Scanner;

public class FactorialNumber {
    /*

	4. Write a program that can return
	the factorial number of any given number
	Ex:
			input: 5
			output: 120
			because: 5! = 5 * 4 * 3 * 2* 1 = 120
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial number:");
        int n = s.nextInt();

double result = 1;

 for (int i = n; i >= 1;i -= 1 ){
     result *= i;

 }
        System.out.println(result);


    }
}
