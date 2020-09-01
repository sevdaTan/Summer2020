package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class DescArr_scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter:");
        int size = scan.nextInt();

        int[] arr = new int [size];

        for (int i = 0; i < size; i++){ // i ==> index number of arr
            System.out.println("Enter a number: ");
           arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] descArr = new int[size];// it contains the descending order of original array
        int k = arr.length-1; //last index
        for(int each : arr){
            descArr[k] = each;
            k--;
        }
        System.out.println(Arrays.toString(descArr));




    }
}
