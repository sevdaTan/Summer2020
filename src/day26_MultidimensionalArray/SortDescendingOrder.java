package day26_MultidimensionalArray;

import java.util.Arrays;

public class SortDescendingOrder {
    public static void main(String[] args) {
// write a program that can sort the array in descending order

      int[] arr = {2,1,3,5,8,7};
        Arrays.sort(arr); // arr: 2 1 3 5 8 7
      int[] desc = new int[arr.length]; // {8 7 5 3 2 1}
          desc [0] = arr[arr.length-1];

          int k = arr.length-1;
          for (int i = 0; i <= desc.length - 1 ; i++){// i: 1,2,3,5,7,8
              desc[i] = arr[k]; // tersine cevirir
              k--;
          }

        System.out.println(Arrays.toString(desc));


    }
}
