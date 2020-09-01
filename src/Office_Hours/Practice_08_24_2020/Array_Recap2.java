package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;

public class Array_Recap2 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7,9};

        for (int each : nums){
            if(each % 3 != 0){
                continue;
            }
            System.out.println(each);
        }
        System.out.println("===========");

        String[] names = {"Sevda","Kevser","Nurbiye","Jika","Aysen"};

        for(String each : names){
            if (each.toLowerCase().contains("n")){
                System.out.println(each);
            }
        }
        System.out.println(Arrays.toString(names));

        System.out.println("==========");

        int[] arr1 = {89,-290,654,67,-3};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        String[] names2 = {"Sevda","Kevser","Nurbiye","Jika","Aysen"};
        Arrays.sort(names2);
        System.out.println(Arrays.toString(names2));

        System.out.println("===========");

        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,3,4};

        System.out.println(Arrays.equals(a1,a2));
    }
}
