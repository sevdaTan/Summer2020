package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {
    /*
    Task02:
		1. create a return method that can return an int
		array in descending order
		2. create a return method that can return a double
		 array in descending order
		3. create a return method that can return a String
		 array in descending order
		4. create a return method that can return a char
		 array in descending order
     */

    public static void main(String[] args) {

      int[] arr = {2,5,1,3,4};
        Arrays.sort(arr); // sorts as ascending order ==> 1,2,3,4,5
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int [arr.length]; // 5,4,3,2,1

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }

        System.out.println(Arrays.toString(arr2));

        System.out.println("========");

        int[] scores = {23,43,66,47,59,90,89,44};
        scores = sortDesc(scores);

        System.out.println(Arrays.toString(scores));
        System.out.println("==========");

        double[] n1 = {2.3,4.3,6.6,4.7,5.9,90.7,8.9,4.4};
         n1 = sortDesc(n1);
        System.out.println(Arrays.toString(n1));

        System.out.println("===========");



    }

    public static int[] sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int [arr.length]; // 5,4,3,2,1

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }



    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double [arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }


    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char [arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }

    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String [arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++){
            arr2[i] = arr[k];
            k--;
        }
        return arr2;
    }






}
