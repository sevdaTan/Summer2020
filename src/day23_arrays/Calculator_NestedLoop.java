package day23_arrays;

import java.util.Scanner;

public class Calculator_NestedLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        while(true) {
            System.out.println("Enter two numbers: ");
            double num1 = scan.nextDouble();
            double num2 = scan.nextDouble();
            System.out.println("Enter the math operator:");
            char operator = scan.next().charAt(0);
// ternary yerine switch ya da multiple if de kullanabiliriz.
            double result = (operator == '+') ? num1 + num2 :(operator == '-') ? num1 - num2 :
                    (operator == '*') ? num1 * num2 :(operator == '/') ? num1 / num2 : (operator == '%') ?num1 % num2 : 0;


            System.out.println(result);
            System.out.println("Do you want to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println(("Invalid Answer, please enter yes or no"));
                System.out.println("Do you want to continue?");
                a = scan.next().toLowerCase();
            }

            if (a.equals("no")){
                break;
            }

        }

        System.out.println("Thank you for using Cybertek Calculator :)");







    }
}
