package day47_Encapsulations;

public class constructor {

    static {
        System.out.println("static block");
    }

    public constructor(int a){
       // this(10); // constructor cannot call itself
        // this(10.0); // constructor cannot call itself/ repetition
       // this(); //int diger ikisinin icinde gectigi icin compiler error verir
        System.out.println("int argument");
    }
    public constructor(double a){
        //this("aaa");
        this(40);//int arg // bir cons. birden fazla constructor cagiramaz
        System.out.println("double argument");// double arg

    }

    public constructor(String a){
        this(5.5); // int , double
        System.out.println("String argument");// string
    }

    public static void main(String[] args) {

        //new constructor();
//        new constructor(10);//int
//        new constructor(10);// bu sekilde ikisi de int arg olur.
       // new constructor(10.7); //double
        new constructor("AAAA"); //double

    }



}
