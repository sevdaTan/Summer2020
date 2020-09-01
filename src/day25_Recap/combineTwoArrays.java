package day25_Recap;

import java.util.Arrays;

public class combineTwoArrays {
    public static void main(String[] args) {
     /*
   6. write a program that can combine two arrays of
   integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}

        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8
     */

      int[] arr1 = {1,2,3,11};
      int[] arr2 = {6,8,7,1,2,4,5,18};

      int size = arr1.length + arr2.length;
      int[] arr3 = new int[size]; // size is 5 now


       int index = 0;
       for(int each : arr1){
        arr3[index]  = each;
        index += 1;
       }
       for(int each : arr2){
           arr3[index] = each;
           index += 1;
       }

        System.out.println(index);
       Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));
        System.out.println("Maximum: " +arr3[arr3.length-1]);

    }
}
