package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class minimum {
    public static void main(String[] args) {

        int min = 99999999; //whatever user enters it will always be less than this input

        Scanner scan = new Scanner(System.in);

                for (int i = 0; i < 5; i++){
                    System.out.println("Enter a number:");
                    int n = scan.nextInt();
                    if (n < min){
                        min = n;
                    }




                }

        System.out.println("The minimum number is: "+ min);




    }
}
