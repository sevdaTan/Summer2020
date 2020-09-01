package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//write a program that asks user to enter two string then print the longest string
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str1 = keyb.nextLine();
        System.out.println("Enter another sentence: ");
        String str2 = keyb.nextLine();



        System.out.println("==========");
        // ask user to enter two words.then add them together and print






        System.out.println("===========");

        System.out.println("Enter a sentence: ");

        String str3 = keyb.nextLine();
        int lastIndexNum = str3.length() -1;
        System.out.println(str3.charAt(0));
        System.out.println(str3.charAt(lastIndexNum));

        System.out.println(""+str3.charAt(0) + str3.charAt(lastIndexNum));

        System.out.println("=========");

        System.out.println("Enter your first name: ");
         String name = keyb.next().toUpperCase();
        System.out.println("Enter your last  name: ");
        String last_name = keyb.next().toUpperCase();

        String fullName = name +" "+ last_name;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);



    }


}
