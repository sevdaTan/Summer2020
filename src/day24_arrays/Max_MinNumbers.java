package day24_arrays;

import java.util.Scanner;

public class Max_MinNumbers {
    public static void main(String[] args) {

       // 2. write a program that asks user
        // how many numbers he wants to enter,
        // and get all the user inputs and store
        // them into an array variable, and then
        // write the program that can return maximum and minimum numbers

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i <= n-1; i++){ // get user input and store them in the array
            System.out.println("Enter a number: "+ (i));
           arr[i] = scan.nextInt();

        }

        int min = arr[0];
        int max = arr[0];
        for(int i =0; i <= arr.length-1;i++){
            if(arr[i] < min){
                min = arr [i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The minimum number in the array is: "+ min);
        System.out.println("The maximum number in the array is: "+ max);




    }
}
