package day09_IfStatements;

public class positive_negative_zero {
    /*
     write a program that can check if number is positive negative or equals to zero.

	 	for example:
			num  = 1

			prints:
				1 is positive number

			num = -6

			print:
				6 is negative number


			num = 0

			print:
				zero



     */

    public static void main(String[] args) {

        double num = -908.765;

        if (num > 0){
            System.out.println(num +" is a positive number");
        }
        if (num < 0){
            System.out.println(num + " is a negative number");
        }
        if (num == 0){
            System.out.println("zero");
        }




    }

}
