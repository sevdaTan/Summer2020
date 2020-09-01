package day08_Logical_Operators;

public class smallerNumber {

    public static void main(String[] args) {

        double num1  = -32.89;
        double num2  = -32.93;

        if (num1 < num2) {
            System.out.println(num1 + " is smaller than "+num2);
        }
        if (num2 < num1){
            System.out.println(num2 + " is smaller than "+num1);
        }
        if (num1 == num2){
            System.out.println("Both numbers are equal!");
        }


    }


}
