package day32_MethodOverloading;
import Library.Util;

import java.util.Arrays;

public class MethodCall {
    public static void main(String[] args) {

        String first = "EneS";
        String last = "BuRak";

        String fullName;

       fullName = Util.formatFullName(first,last);
        System.out.println(fullName);

        System.out.println("*************");

        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        System.out.println("*************");

        String reversedName = Util.reverseString(fullName);
        System.out.println(reversedName);

        System.out.println("*************");

      int[] a = {200,3,56,78,980,65,4,57};
      int n = 232;

      a = Util.addElement(a,n);
        System.out.println(Arrays.toString(a));



    }
}
