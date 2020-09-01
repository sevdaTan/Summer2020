package day12_Switch_Scanner;

public class biggerNum {
    /*1. write a program that checks for the bigger of 3 numbers.
		you get 3 int variables: n1 , n2 and n3 (none of them are equal)
			if n1 is biggest output: "n1 is bigger"
			if n2 is biggest output: "n2 is bigger"
			if n3 is biggest output: "n3 is bigger"

			example:
					n1 = -2
					n2  = 2
					n3  = 1

				output: "n2 is bigger"

			NOTE: DO NOT USE IF STATEMENT
     */
    public static void main(String[] args) {

        int num1 = -2 , num2 = 2, num3 = 11;
        String r = (num1 > num2 && num1 > num3) ? "num1 is bigger":
                   (num2 >num1 && num2 > num3) ? "num2 is bigger":
                    "num3 is bigger";
        System.out.println(r);



    }
}
