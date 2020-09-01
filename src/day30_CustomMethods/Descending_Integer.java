package day30_CustomMethods;

import java.util.Arrays;

public class Descending_Integer {
 //2. create a function that can print out the array
    // of integers in descending order

    public static void main(String[] args) {

        int arr[] = {30,40,60,50,80,10};

         printDesc(arr);


    }

    public static void printDesc(int[] arr){ //{30,40,60,50,80,10}
        Arrays.sort(arr); // {10,30,40,50,60,80}

        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " "); //{80,60,50,40,30,10}

        }
        System.out.println();
    }


}
