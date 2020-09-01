package Office_Hours.Practice_07_07_2020;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

      /*  String str = "Batch20";
                  //  0123456
        str.charAt(6);// 0
        str.charAt(5);// 2
        str.charAt(4);// h
        str.charAt(3);// c
        str.charAt(2);// t
        str.charAt(1);// a
        str.charAt(0);// B

String result = "";
for(int i = 6; i >= 0; i--){
 result += str.charAt(i);
   // System.out.println(result); Loop un icine statement yazinca artirarak print ediyor
}
        System.out.println(result);
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scan.nextLine();
        String result = "";
        for(int i = str.length()-1; i >= 0; i-=1) {
            result += str.charAt(i);
        }
        System.out.println(result);

        System.out.println("++++++++++++++++++");
        String result2 = "";
        int index = str.length()-1;

        while(index >= 0){
           result2 += str.charAt(index);

            index -= 1;
        }

        System.out.println(result2);


    }
}
