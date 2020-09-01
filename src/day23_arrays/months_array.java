package day23_arrays;

import java.util.Scanner;

public class months_array {
    public static void main(String[] args) {

   String month[] = {"Jan","Feb","Mar","Apr","May","June", "July","Aug","Sept", "Oct","Nov","Dec"};

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number 1~12: ");
    int n = scan.nextInt();

            System.out.println(month[n -1]);

    }
}
