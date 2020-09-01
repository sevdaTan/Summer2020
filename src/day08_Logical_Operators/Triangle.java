package day08_Logical_Operators;

public class Triangle {

    public static void main(String[] args) {

        double angle1 = 100;
        double angle2 = 60;
        double angle3 = 40;

        boolean valid = angle1 + angle2 + angle3 == 180;
        boolean invalid = !valid;

        if(valid){
            System.out.println("Valid Triangle");

        }
        if(invalid){
            System.out.println("Invalid Triangle");
        }

        System.out.println("********************");





    }
}
