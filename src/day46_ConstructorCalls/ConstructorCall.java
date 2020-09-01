package day46_ConstructorCalls;

public class ConstructorCall {
    // Only a constructor method can call another constructor method.
    //
    public ConstructorCall(){
        method1();
        method2();
        method3();

    }

    public static void method1(){
        method2();
       // ConstructorCall(); gives compiler error
    }
    public static void method2(){
        method1();
        // ConstructorCall(); gives compiler error
    }
    public void method3(){
        // ConstructorCall(); gives compiler error

    }

}
