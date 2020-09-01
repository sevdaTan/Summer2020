package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {
    public static void main(String[] args) {

        Integer num = 100; // Integer here is not a primitive, it is a class
        int a = 100;

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
        //Integer n2 = b2; //It only dedicates its own primitive. it doesn't accept the others

        Integer n3 = new Integer(123);

        int[] arr = new int[3];
        double[] arr1 = new double[3];
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        Double[] arr2 = new Double[3];
        System.out.println(Arrays.toString(arr2));
        Integer[] arr3 = new Integer[3];
        System.out.println(Arrays.toString(arr3));


        int p1 = 300;
        Integer p2 = p1; // AutoBoxing

        Integer q1 = 500;
        int q2 = q1; // unboxing

       // Double r1 = 300; //wrapper class is only dedicated to its primitive
       Double r1 = 300.0;
        double r2 = r1; // unboxing

        long l1 = 400;
        Long l2 = l1 ; // Autoboxing

        Float f1 = 100.7f;
        Float f2 = f1; // Not Autoboxing / Not unboxing



    }
}
