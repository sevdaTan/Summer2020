package day22_NestedLoop;

import java.util.Scanner;

public class UserName_Password {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String u = scan.next();

        System.out.println("Enter your password: ");
        String p = scan.next();

        int attempt = 1;

        while ( !(u.equals("cyber") && p.equals("tek123")) ){
            if(attempt == 3){
                System.out.println("Your account is locked!");
            System.exit(0);
            }

            System.out.println("Invalid user name or password. Please try again!");
            System.out.println("Enter your user name: ");
             u = scan.next();

            System.out.println("Enter your password: ");
            p = scan.next();
            attempt++;

        }

        System.out.println("Logged in!");




    }
}
