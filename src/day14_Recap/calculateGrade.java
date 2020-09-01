package day14_Recap;

import java.util.Scanner;

public class calculateGrade {
    /*
   1. write a program that can calculate the grade of the student based on the given score

					90 <= score <= 100 ==> Excellent
					80 <= score <= 89 ==> Great
					70 <= score <= 79 ==> Good
					60 <= score <= 69 ==> Passed
					0 <= score <= 59 ==> Failed
					other == > Invalid Entry
			MUST use Scanner and nested IF
     */
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int grade = keyb.nextInt();
        String result = " ";

        if (grade >= 0 && grade <= 100){
            if (grade >=90 ){
                 result ="Excellent";
            }else if (grade >= 80 && grade <= 89){
                result = "Great";
            }else if (grade >= 70 && grade <= 79){
                result = "Good";
            }else if (grade >= 60 && grade <= 69){
                result = "Passed";
            }else{
                result = "Failed";
            }

        }else{
            result ="Invalid Entry";
        }
        System.out.println(result);






    }
}
