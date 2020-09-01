package day43_Static;

import Library.Resources;

import java.util.Arrays;
import static Library.Resources.a; // only imports static variable a
import static  Library.Resources.*; // imports all class members from Resources class
public class Test {
    public static void main(String[] args) {
        System.out.println(Static_Block_3.a);
        System.out.println(Static_Block_3.b);
        System.out.println(Static_Block_3.c);


        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);
        System.out.println("=====   ======");

        System.out.println(a);

    }

}
