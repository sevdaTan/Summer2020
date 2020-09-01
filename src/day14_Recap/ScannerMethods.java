package day14_Recap;
import java.util.Scanner;
public class ScannerMethods {

    public static void main(String[] args) {

     Scanner keyb = new Scanner(System.in);
     keyb.nextInt();
        System.out.println("Done");

        System.out.println("Enter a number: ");
        int number = keyb.nextInt();
        System.out.println("You have entered "+ number);

        System.out.println("==============");

        System.out.println("Is it possible? : ");
        boolean choose = keyb.nextBoolean(); // answer must be TRUE / FALSE
        System.out.println("You entered: " + choose);

        System.out.println("How is everything going?");
        String how = keyb.next();
        System.out.println("I'm happy to know you are "+ how);

        System.out.println("============");

        System.out.println("Do you want to learn Java?");
        String java = keyb.nextLine();
        System.out.println("Really? "+java);

    }




}
