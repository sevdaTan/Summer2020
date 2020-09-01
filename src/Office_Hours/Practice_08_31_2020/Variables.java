package Office_Hours.Practice_08_31_2020;

public class Variables {

    int c = 90; // instance variable

    static int y = 80; // static variables

    public static void main(String[] args) {
        // local variable
        int a; // there is no default value for local variables
       // System.out.println(a); // gives compiler error

        int b = 20; // we have to initialize the local variables
        System.out.println(b);

        // static & instance variables should be declared outside of any blocks
        // we don't have to initialize static and instance variables before use

    }
}
