package day14_Recap;

import java.util.Scanner;

public class user_input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        String gender = input.next();

        System.out.println("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your country: ");
        String country = input.nextLine();

        System.out.println("Enter the zipcode: ");
        int zip = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String name = input.nextLine();

        System.out.println("Enter the company name: ");
        String company = input.nextLine();

        System.out.println(name + "\n "+ age +"\n "+ company
                + " \n"+ gender+ "\n "+ country + " \n"+ zip);

    }


}
