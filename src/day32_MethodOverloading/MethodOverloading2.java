package day32_MethodOverloading;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class MethodOverloading2 {
/*
asks1:
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers
*/
public static void main(String[] args) {

    addition2Nums(12,54);
    addition3Nums(32,87,6);
    addition4Nums(33,22,55,66);

    System.out.println("*********");

    addition(67,78);
    addition(32,45,33);
    addition(90,89,78,67);

}

    public static void addition2Nums(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition3Nums(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition4Nums(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
   }

    //=====================================

    public static void addition(double a, double b) {
        System.out.println(a + b);
    }

    public static void addition(double a, double b, double c) {
        System.out.println(a + b + c);
    }

    public static void addition(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
     }



}