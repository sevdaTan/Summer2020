package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class combine2Arrays {
    public static void main(String[] args) {

        char[] a1 = {'a', 'b','c'};
        char[] a2 = {'d', 'e','f','g'};

        char[] a3= new char [a1.length + a2.length];
       // index
//        a3[0] = a1[0];//a
//        a3[1] = a1[1];//b
//        a3[2] = a1[2];//c
//        a3[3] = a2[0];//d
//        a3[4] = a2[1];//e
//        a3[5] = a2[2];//f
//        a3[6] = a2[3];//g


        int index = 0;
        for (char each : a1) {
            a3[index] = each;
            index++;
        }
           for (char each : a2) {
               a3[index] = each;
               index++;
        }
           System.out.println(Arrays.toString(a3));





    }
}
