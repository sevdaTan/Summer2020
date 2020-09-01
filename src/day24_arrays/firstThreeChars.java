package day24_arrays;

import java.util.Scanner;

public class firstThreeChars {
    /*
    5. Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out the first three letter of each element of arr, one per line.
			You can assume that every element of arr is at least 3 letters long.
				Example: arr -> ["apple", "banana"]
						prints:  appban
     */
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 strings: ");
        String[] arr = new String[5];
        for(int i  = 0; i <= arr.length-1; i++){
            arr[i] = scan.next();
        }
      for (int i = 0; i <= arr.length -1; i++){
          System.out.println(arr[i].substring(0,3));
      }



    }
}
