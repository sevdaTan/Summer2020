package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethod3 {

    public static void main(String[] args) {

        int arr[] = {7,90,87,56,3,64,22};

        max(arr);


        System.out.println("=========");


        int num = max2(arr);
        System.out.println(num);
        System.out.println(num > 100);

    }

    public static void max(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];

    }
    public static int max2(int[] arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];

        return max;
    }


}
