package day05_ArithmeticOperators;

import com.sun.org.apache.xpath.internal.res.XPATHErrorResources_sv;

import java.util.function.DoubleToIntFunction;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(20 + 3 - 2 + 1);
                        // 23 - 2 + 1 = 21 +1 =22

        System.out.println(20 * 3);

        System.out.println(2 + 3 - 1 * 4);//2+3-4 = 5-4 = 1


        //Division
        System.out.println(10 / 3); // int / int = int
        System.out.println(10.0 / 3); // double / int = double
        System.out.println(10 / 3.0); // int / double = double
        System.out.println(10.0 / 3.0); // double / double = double

        //% = Remainder ( bolumden kalan sayi)

        System.out.println();//5+ 2 * 4); //13
        System.out.println(10 / 2 - 3);//2
        System.out.println(8 + 12 * 2 - 4);//28
        System.out.println(4 + 17 % 2 - 1); //4


        System.out.println( 30 % 8);// 30 - (8 * 3) = 6

        System.out.println(99 % 4); // 99 / 4 = 99 - 96 = 3


    }


}
