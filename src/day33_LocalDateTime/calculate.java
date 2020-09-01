package day33_LocalDateTime;

import java.util.Arrays;

public class calculate {
    /*
    Task01:
		1. create a method that can calculate the addition
		 of two integers
		2. create a method that can calculate the addition
		 of two decimals

		3. create a method that can calculate the
		multiplication of two integers
		4. create a method that can calculate the
		 multiplication of two decimals
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(addition(a,b));

        double a1 =21.6;
        double b1 = 6.9;
        System.out.println(addition(a1,b1));


        System.out.println(addition(68,55.4));
        System.out.println(addition(2.4,6));

        int[] arr1 = {4,3,2,1};
        Arrays.sort(arr1);

        char[] arr2 = {'A','D','C','B'};
        Arrays.sort(arr2);


        System.out.println(multiplication(12, (int) 10.3));


    }





    public static  int addition(int a,int b){ return a+b;}
    public static double addition(double a,double b){ return a+b;}
    public static double addition(double a,int b){ return a+b; }


    public static int multiplication(int a,int b){ return a * b;}
    public static double multiplication(double a,double b){return a * b;}
    public static double multiplication(double a,int b){return a * b; }

}
