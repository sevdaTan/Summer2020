package day21_Loops;

import java.util.Scanner;

public class min_MaxNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max= -999999999;// any entered number will be greater than  -999999999
        int min = 999999999;// any entered number will be less than 999999999



        for (int i = 0; i <= 5; i++ ){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }


        }
        System.out.println("Your maximum number is: "+ max+"\n" +
                "Your minimum number is: "+min);



    }
}
