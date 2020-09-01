package day14_Recap;

import java.util.Scanner;

public class buy_alcohol {
    /*
      3. write a program that asked the user enter the age and based on the input the program
      should be able to check if the person is eligible to buy alcohol

	   			if age is > 21 , print "here is your wine"
	   			if age is < 21, print "get out kid"
	   			if age is invalid, print "Invalid Entry"


	   			MUST use Scanner and nested IF
     */
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("How old are you: ");
        int age = keyb.nextInt();

        if (age >= 1 && age <= 150){
            if (age > 21){
                System.out.println("Here is your wine");
            }else{
                System.out.println("Get out kid");
            }
             }else{
            System.out.println("Invalid Entry");
        }



    }
}
