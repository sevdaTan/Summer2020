package day17_StringPractice;

import java.util.Scanner;

public class warmup6 {
    /*
    6. write a program that will return the domain of an email address:
			Ex:
				input: test@gmail.com
				output: the domain of the email is: gmail

				inputL: Cybertek@yahoo.com
				output: the domain of the email is: yahoo
     */
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email =scan.next();
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("The domain of the email is: "+domain);





    }
}
