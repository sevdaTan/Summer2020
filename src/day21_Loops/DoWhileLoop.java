package day21_Loops;

public class DoWhileLoop {
    public static void main(String[] args) {
        // burada true condition olsaydi ikisi de infinite loop olur
        boolean result = false;
        while(result){ // never executes if the condition is false
            System.out.println("Hello world");
        }
        System.out.println("+++++++++++++++");
        do{ // just do it
            System.out.println("Hello world");
        }while(result);


    }
}
