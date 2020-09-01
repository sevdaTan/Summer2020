package day24_arrays;

public class uniqueNumbers {
    public static void main(String[] args) {
/*
write a program that can print out the unique numbers
from an array of integers.
ex: int [] arr = {1,1,2,3,3,4}
output ==> 2 4
 */
        int[] arr = {1,2,2,3,4,5,4,7};
      for(int j = 0; j <= arr.length-1; j++) {
          int num1 = arr[j];
          int count = 0;
          for (int i = 0; i <= arr.length - 1; i++) {// only calculates the frequency of number
              int each = arr[i];
              if (each == num1) {
                  count++;
              }
          }
          if (count == 1) {
              System.out.print(num1+ " ");
          }
      }



    }
}
