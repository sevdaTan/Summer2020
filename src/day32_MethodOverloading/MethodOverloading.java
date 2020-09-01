package day32_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {


        int[] arr = {9,7,6,8};
        Arrays.sort(arr);

        String[] names = {"r","p","o","s"};
        Arrays.sort(names);

    }


    public static void method(int a){

    }
    public static void method(int a,int b){

    }
    public static void method(double a){


    }


}
