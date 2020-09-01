package day08_Logical_Operators;

public class odd_even {

    public static void main(String[] args) {

        int number = 103;

        boolean even = number %2 == 0;
        boolean odd = !even;

        if (even){
            System.out.println( number +" is even number");
        }
        if (odd){
            System.out.println(number + " is odd number");
        }





    }
}
