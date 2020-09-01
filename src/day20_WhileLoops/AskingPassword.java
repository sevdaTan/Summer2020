package day20_WhileLoops;

import java.util.Scanner;

public class AskingPassword {
    public static void main(String[] args) {

        String password= "Cybertek123";

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

       while (!input.equals(password)){
            System.out.println("Please re-enter your password:");
            input= scan.nextLine();

        }
        System.out.println("Logged in!");







    }
}
