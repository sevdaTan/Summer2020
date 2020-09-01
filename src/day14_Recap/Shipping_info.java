package day14_Recap;

import java.util.Scanner;

public class Shipping_info {
/*
		2. write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:

			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102

 */
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);

        System.out.println("Enter the building number: ");
        int buildingNum = keyb.nextInt();

        keyb.nextLine();

        System.out.println("Enter the street address: ");
        String Street = keyb.nextLine();

        System.out.println("Enter the city name: ");
        String city = keyb.nextLine();

        System.out.println("Enter the state name: ");
        String state = keyb.next();

        System.out.println("Enter the zip code: ");
        int zipcode = keyb.nextInt();

        keyb.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = keyb.nextLine();

        System.out.println("Ship To: " + fullName + "\n"+ buildingNum + " "+
                Street + "\n" + city + ", "+ state + " "+ zipcode);






    }



}
