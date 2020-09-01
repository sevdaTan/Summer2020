package day43_Static;

public class Static_Block {
// always static block runs first at the very beginning
    // static block runs only once

    static {
        System.out.println("Static Block");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static Block");
    }
    //Result:
   //static block
    //static block
    //main method

}
