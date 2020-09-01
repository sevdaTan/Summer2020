package day19_Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class WarmUp_SumNumbers {
    public static void main(String[] args) {
        /*
        4. write a program that can calculate the
        sum of all numbers between 1 to 100
*/
        int sum = 0;
       for (int i = 1; i <= 100; i++){
           sum += i;
       }
        System.out.println(sum);


   /*
	5. write a program that can calculate
	the sum of all the even numbers between 1 ~ 100
*/
       int sum1 = 0;
        for (int m =1; m <= 100; m++) {
            if (m %2 == 0){
                System.out.print(m + " ");
                sum1 = sum1 + m;
            }
        }
        System.out.println();
        System.out.println(sum1);


        /*
	6. write a program that can calculate
	the sum of all the odd numbers between 1 ~ 100
*/
        int sum2 = 0;
        for (int y =1; y <= 100; y++) {
            if (y %2 != 0){
                System.out.print(y + " ");
                sum2 = sum2 + y;
            }
        }
        System.out.println();
        System.out.println(sum2);
 /*
	7. write a program that can calculate the sum
	of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050

            input: 50
            output: 1275

            input : 200
            output : 20100
         */
        System.out.println("Enter first number: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Enter second number: ");
         int b = scan.nextInt();

         int sum3 = 0;

        System.out.println("The sum of the numbers" +
                " between "+ a +" and "+ b +" is: ");
for (int num = a; num <= b; num++ ){
    sum3 += num;
}
        System.out.println(sum3);
        System.out.println();

        System.out.println("************");
        System.out.println("Enter a number: ");
        int q = scan.nextInt();
        int sum4 = 1;
        if (q >1){
            for (int z = 1; z <= q;z++ ){
                sum4 += z;
            }
            System.out.println(sum4);
        }else{
            System.out.println("Invalid Entry!");
        }

        System.out.println("************");
        System.out.println("Enter a negative number: ");
        int negative = scan.nextInt();
        int sum5 = -1;
        if (negative < 0 ){
            for (int i1 = -1; i1 <= negative;i1--){
                sum5 -= i1;
            }
            System.out.println(sum5);
        }else{
            System.out.println("Invalid Entry!");
        }


    }
}
