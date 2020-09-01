package day29_CustomMethods;

import java.util.Scanner;

public class methodsWithParameter {

    public static void main(String[] args) {

        printHello(12);
        System.out.println("**************");
        age(1984);
        System.out.println("*************");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year  and current year:");
       // age(2011, 2032);
        int birthyear = scan.nextInt();
        int currentyear = scan.nextInt();
        age(birthyear, currentyear);

    }



    // n'i tanimliyoruz, yukaridaki bosluga ne kadar
    // yazilmasini istiyorsak onu rakamla belirtiyoruz.
    //Asagidaki data type ile yukaridakinin ayni olmasi gerekiyor
    // (int-int, String - String, double - double etc.)
    public static void printHello(int numberOfTimes){
        for (int i = 0; i < numberOfTimes; i++){
            System.out.print("Hello-World  ");
        }
        System.out.println();
    }

    //Age of a person

    public static void age(int birthYear){
        int age = 2020 - birthYear;
        System.out.println("You are "+ age + " years old");
    }

    // calculate age

    public static void age(int birthYear , int currentYear) {
        if (currentYear < birthYear) {
            System.out.println("Invalid Entry!");
        } else {
            int age = currentYear - birthYear;
            System.out.println("You are " + age + " years old");
        }
    }


}
