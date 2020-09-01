package day23_arrays;

import java.util.Scanner;

public class reservation_NestedLoop {
    /*
    2. write a program for the room reservation:
           King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
            if yes ==> repeat the previous steps
            if no ==> your total price is: $$$
             while answer is neither yes or no ==> please re-enter

           	HINT: nested loop task, outer loop need to be an infinite loop
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Cybertek Inn");

        while(true) {
            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed:$120");
            System.out.println("2. Queen Bed:$100");
            System.out.println("3. Single Bed:$80");

            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;
                default:
                    System.out.println("Get out");
                    System.exit(0);
            }
            System.out.println("Do you want to reserve another room? ");
            String a = scan.next().toLowerCase();

            while(!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid answer. Please re-enter yes or no: ");
                System.out.println("Do you want to reserve another room?");
                a = scan.next().toLowerCase();
            }

            if (a.equals( "no")){
                break;
            }
        }
        System.out.println("Your total price is: $" + total);

    }
}
