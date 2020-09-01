package day07Unary_shorthand;

public class positive_negative_0 {
/*
write a program that can verify if a number is positive,
negative or 0
 */
    public static void main(String[] args) {

       double number = 0.1;

        boolean positive = number > 0;
        boolean negative = number < 0;
        boolean zero = number == 0;

        System.out.println("The number " + number + " is a positive number? ==> "+ positive);
        System.out.println("The number " + number + " is a negative number? ==> "+ negative);
        System.out.println("The number " +number + " is zero ==> " + zero);



    }

}
