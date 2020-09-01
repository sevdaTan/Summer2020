package day43_Static;

public class Variables {
    // instance variables belong to object. you don't have to initialize
    //  local variable belong to  object .
    // static variable belongs to class.
    // anything shared by class, it also shared by the object
    // But, anything shared by object is not shared by class
    // instance variables can accepts both instance variables and static variables
    // static variable == global variable
    // it is accepted both in instance or static method
    // But static method accepts only static variable
    // If we want to call an instance variable to static method, we have to initialize it first
    // we cannot use the local variable outside of the block
    // we have to initialize local variables before using
    // instance variable can be declared outside of the any methods or blocks
   //You can use the instance variable without initializing.It gives default value(0,0.0,null,false etc)






    int d; // instance variable // belongs to the object
    static int s; // static variable // belongs to the class

    public static void main(String[] args) {

        System.out.println(s);

       // System.out.println(d); Static only accepts static,
        // so we have to initialize the instance variable before using it. Ex:

        Variables obj = new Variables();// we initialize the object like this
        System.out.println(obj.d);


    }

    public static void method1(){

        int a = 10; // we have to initialize
        // the local variable before using it. Otherwise we cannot use it!!!
        // it should be declared inside of the method

        if (true){
            int b = 20;
        }
        System.out.println();
    }



}
