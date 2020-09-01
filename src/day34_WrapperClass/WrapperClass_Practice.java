package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        Integer[] arr2 = {1,2,3,4};
        for (Integer each : arr2){ // int de yazsak calisirdi unboxing olacagi icin
            System.out.print(each +" ");
        }
        System.out.println();

        double[] arr3 = {1,2,3,4,5};
        Double[] arr4 = {1.4,2.6,3.0,4.7,5.5}; // it is dedicated to its own primitive,
                                    // so we should assign the numbers as a double,too

          for(Double each : arr4){
          System.out.println(each);
          }

          char[] arr5 = {65,66,67,68,69};
        System.out.println(Arrays.toString(arr5));// ABCD

        char ch = 79;
        Character ch2 = 79;
        System.out.println(ch);
        System.out.println(ch2);

      // parse String[] to double[]
        String[] nums1 = {"11.6" , "12.8","13.5" , "14.3"};
        double[] nums2 = new double[nums1.length];
        for(int i = 0; i <= nums1.length-1; i++){
           nums2[i] = Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));


    }
}
