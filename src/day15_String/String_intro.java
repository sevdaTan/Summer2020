package day15_String;
import java.lang.String;
import java.util.Scanner;
public class String_intro {

    public static void main(String[] args) {

      String str = "Cybertek";
      Scanner keyboard = new Scanner(System.in);

      String name = new String("sevda");
      String last_name = new String("Tan");

      String gender = "Female";
      String status = "Test Engineer";

      String s1 ="Cat";//String literal. located in the String pool
      String s2 = "Cat"; //String literal. located in the String pool

        System.out.println(s1 == s2);//true because memory locations are shared, so locates in the same place

        String d1 ="Dog";//String literal. located in the String pool
        String d2 = "dog"; //String literal. located in the String pool
        System.out.println(d1 == d2);//false

        String t1 = new String("Tiger");// located in Java heap
        String t2 = new String("Tiger");// located in Java heap
        System.out.println(t1 == t2);// false because memory locations are different in java heap

        String c1 = "Cybertek"; //string pool
        String c2 = new String ("Cybertek");// java heap
        System.out.println(c1 == c2);
                // "Cybertek" == new String ("Cybertek") they are in different place

         String str1 = "Java";
         str1 = "Javascript";
        System.out.println(str1);// javascript
        str1 = "Java";
        System.out.println(str1);//java

      System.out.println();







    }



}
