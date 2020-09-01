package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClass_Practice2 {
    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        System.out.println(a);

        byte b = Byte.MAX_VALUE;
        System.out.println(b);


        int a2 = Integer.MIN_VALUE;
        System.out.println(a2);

        double d1 = Double.MIN_VALUE;
        System.out.println(d1);

        System.out.println("=======MAX_NUM && MIN_NUM======");
        Scanner scan = new Scanner(System.in);
         int max = Integer.MIN_VALUE;
         int min = Integer.MAX_VALUE;
        for (int i = 1; i <= 5;i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if(n > max){
                max = n;
            }
            if(n < min){
                min = n;
            }
        }
        System.out.println("Max num: "+ max);
        System.out.println("Min num: "+ min);
    }





}
