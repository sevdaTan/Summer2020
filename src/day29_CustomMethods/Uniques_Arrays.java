package day29_CustomMethods;
/*
 1.  Write a program that can print out the unique values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class Uniques_Arrays {
    public static void main(String[] args) {

     String[] arr = {"A","B","C","B","D","C"};

     for (String a : arr) { //gets each of the element

         int count = 0;

         for (String each : arr) { // checks the frequency of the element
             if (a.equals(each)) {
                 count++;
             }
         }
         if (count == 1) { // checks if the element is occurred only once or not
             System.out.println(a);
         }
     }



    }

}
