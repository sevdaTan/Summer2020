package day25_Recap;

import java.util.Arrays;
/*
Create an int array called numbers that has length
of 100 and Assign 1-100 to each index of the array.
then print out all the even numbers. MUST use continue statement
 */
public class array_1_100 {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i <= numbers.length-1; i ++){
            numbers[i] = i+1;
        }

        //System.out.println(Arrays.toString(numbers));// 1'den 100'e kadar tum sayilari print eder

        for (int each : numbers){
            if (each %2 != 0){
                continue;
            }
            System.out.print(each+ " "); // sadece cift sayilari print eder
        }


    }
}
