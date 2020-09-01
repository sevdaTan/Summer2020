package day23_arrays;

import java.util.Scanner;

public class Days_array {
    public static void main(String[] args) {


        String days[] = new String[7];

        days[6] = "Sunday ";
        days[2] = "Wednesday ";
        days[5] = "Saturday ";
        days[0] = "Monday ";
        days[4] = "Friday";
        days[1] = "Tuesday ";
        days[3] = "Thursday ";

        for (int i = 0; i <= days.length - 1; i++){
            System.out.print(days [i]+ " ");
        }
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1~7: ");
        int n = scan.nextInt();
        System.out.println(days[n-1]);
    }
}
