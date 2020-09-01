package day46_ConstructorCalls;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("A"); // A
    }
    public ConstructorCalls2(int a){

       // ConstructorCalls2(); //gives compiler error when we call it directly
        this(); // when we call another constructor by  this(); keyword
        System.out.println("B"); // B
    }
    public ConstructorCalls2(String str) {
        this(4);// A B
        System.out.println("C"); // C

    }
    public ConstructorCalls2(char a){
        this();
        System.out.println("D"); // D
    }
    public ConstructorCalls2(double a) {
        this('F');
        System.out.println("E");
        // this(4.5); We should write this() before printing/ on the first step

    }
    public static void main(String[] args) {
        new ConstructorCalls2('G');


    }


}
