package day46_ConstructorCalls;

public class ConstructorCalls3 {

    public ConstructorCalls3(){
        System.out.println("X");

    }
    public ConstructorCalls3(int a){
        this();
        System.out.println("Y");
    }
    public ConstructorCalls3(double a){
        this();
        // this(10); we can call maximum one constructor once
    }


    public void method1(){
       //ConstructorCalls3(); --> cannot be called by name
       //this(); -->  can only be used in constructor
    }







    public static void main(String[] args) {


    }



}
