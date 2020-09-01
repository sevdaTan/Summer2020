package day29_CustomMethods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Grades_ReturnKeyword {
   /*
    6. calculate the grade of the student based on the score
*/

    public static void main(String[] args) {
        grades(77);
        grades(102);
        System.out.println("=========");
        eligibleToBuyAlcohol(true,17);
        eligibleToBuyAlcohol(true,45);

    }

public static void grades(int score){

        if (score < 0 || score > 100){
            System.out.println("Invalid score");
            return;
        }
         char grades = (score >= 90) ? 'A' : (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :(score >= 60) ? 'D' : 'F';
          System.out.println("Grade is: " +grades);
}
// Alcohol
    public static void eligibleToBuyAlcohol(boolean hasID, int age){
        if(hasID && age > 21){
            System.out.println("You're eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible to buy alcohol!");
            return;
        }
    }







}
