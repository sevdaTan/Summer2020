package day29_CustomMethods;

public class MaxMinNumbers_Methods {

/*
11. write a method that can print out the maximum number from any array of integers
    12. write a method that can print out the minimum number from any array of integers

 */
public static void main(String[] args) {

    int[] numbers = {10,89,77,5,6,778,43,23,543,90};

    maxNum(numbers);
    minNum(numbers);


}




public static void maxNum(int[] arr){
    int max = arr[0];

    for( int each : arr) {
        if (each > max) {
            max = each;
        }
    }
    System.out.println("Max num :" + max);
}
    public static void minNum(int[] arr){
        int min = arr[0];

        for( int each : arr) {
            if (each < min) {
                min = each;
            }
        }
        System.out.println("Min num: "+ min);
    }



}
