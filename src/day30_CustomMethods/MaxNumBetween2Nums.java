package day30_CustomMethods;
//1. create a function that can print out
// the maximum number between two numbers
public class MaxNumBetween2Nums {

    public static void main(String[] args) {

        maxNum(4,6);


    }
    public static void maxNum(int a,int b){
        if ( a == b){
            System.out.println("Equal");
        return;  // exits the method safely
        }
        if (a >= b){
            System.out.println(a + " is maximum number");
        }else{
            System.out.println(b + " is maximum number");
        }


    }


}
