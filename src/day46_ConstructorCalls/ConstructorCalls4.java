package day46_ConstructorCalls;

public class ConstructorCalls4 {

    public ConstructorCalls4(){
     //  this(2.5);  compile error / const. cannot call itself

    }
    public ConstructorCalls4(int a){
this(2.5); //contains const. with double argument

    }
    public ConstructorCalls4(double a){
    //this(10); compile error / const. cannot call itself

     this(); // contains default argument




    }





}
