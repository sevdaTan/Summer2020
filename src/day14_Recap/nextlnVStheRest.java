package day14_Recap;

import java.util.Scanner;

public class nextlnVStheRest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your full name: ");
        String name = scan.nextLine();

        System.out.println("Your name is "+ name+ "\nYour age is: "+age);

    }


}
