package day10_IfStatements;

public class triangle {
    /*
     A triangle is valid if the sum of all the three angles is equal to 180 degrees.
Write a program that declares three integers as angles and check whether a triangle
is valid or not.

		Note: MUST use if&else statement

     */
    public static void main(String[] args) {

        int angle1 = 30;
        int angle2 = 90;
        int angle3 = 90;

        String isValid =" ";

        if (angle1 + angle2 + angle3 == 180){
            isValid = "Triangle is valid";
        }else{
            isValid = "Triangle is invalid";
        }

        System.out.println(isValid);


    }
}
