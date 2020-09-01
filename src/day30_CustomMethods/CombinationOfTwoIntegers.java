package day30_CustomMethods;

import java.util.Arrays;

public class CombinationOfTwoIntegers {
    //3. create a function that can
    // print out the combination of two integer arrays
    public static void main(String[] args) {

        int arr1[] = {4,6,5,2};
        int arr2[] = {1,8,9,3};
        combine2Arrays(arr1,arr2);

    }
    public static void combine2Arrays(int[] arr1, int[] arr2) {
        int arr3[] = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) { // birinci arr dan tek tek alip 3.arr a ekliyor
            arr3[i] = each;
            i++;

        }
        for (int each : arr2) { // 2. arr dan alip 3 e yazdiriyor
            arr3[i] = each;
            i++;

        }
        System.out.println(Arrays.toString(arr3));
    }

}
