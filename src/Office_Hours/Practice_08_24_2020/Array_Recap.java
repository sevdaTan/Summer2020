package Office_Hours.Practice_08_24_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Recap {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        //System.out.println(arr1);// hashcode error
        System.out.println(Arrays.toString(arr1));// no value given 0,0,0,0,0
        arr1[0] = 10;
        arr1[arr1.length-1] = 20;

        System.out.println(Arrays.toString(arr1));//10,0,0,0,20

        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr2));//1,2,3,4,5

        System.out.println(arr2[4] * arr2[1] );
        //                    5    *    2   =  10
        System.out.println(arr2[0]  *  arr2[arr2.length-1]);
        //                      1   *   5     =  5

        System.out.println("===========");

        String[] name = new String[5];

        System.out.println(Arrays.toString(name));//null,null,null,null,null

        System.out.println("==========");

        Scanner scan = new Scanner(System.in);
        String[] names = new String[5];

        /*for (int i = 0; i <= 4; i++) {
            System.out.println("Enter a name: ");
            names[i] = scan.nextLine();
        }*/
        for (int i = names.length-1; i >= 0 ; i --){
            System.out.println("Enter a name: ");
            names[i] = scan.nextLine();
        }

        System.out.println(Arrays.toString(names));

    }
}
