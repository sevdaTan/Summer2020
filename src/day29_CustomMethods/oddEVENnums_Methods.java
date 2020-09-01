package day29_CustomMethods;

import javax.swing.*;

/*
task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 0~100
*/
public class oddEVENnums_Methods {
    public static void main(String[] args) {

        oddNums();
        System.out.println("Hello!");
        evenNums();
        System.out.println("Hello World!!!");

    }

    //task1:
    public static void oddNums() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        // task 2:
        public static void evenNums(){
        for (int j = 0; j <= 100; j += 2){
            System.out.print(j + " ");
        }
        System.out.println();
    }


}
