package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_2 {
    public static void main(String[] args) {

        char[] a1 = {'a', 'b','c'};
        char[] a2 = {'d', 'e','f','g'};

        char[] a3= new char [a1.length + a2.length]; // index number of 3rd array


        // index
//        a3[0] = a1[0];//a
//        a3[1] = a1[1];//b
//        a3[2] = a1[2];//c
//        a3[3] = a2[0];//d
//        a3[4] = a2[1];//e
//        a3[5] = a2[2];//f
//        a3[6] = a2[3];//g


        int index = 0; // index of a3
        for (int i = 0; i <= a1.length -1; i++) {
            a3[index] = a1[i];
            index++;
        }
        for (int j = 0; j <= a2.length-1; j++) {
            a3[index] = a2[j];
            index++;
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("=======WHILE LOOP=======");

//int k = 0;
//while (k <=  a1.length -1){
//    a3[index] = a1[k];
//    index++;
//}
//
//        int l = 0;
//        while (l <=  a2.length -1){
//            a3[index] = a2[l];
//            index++;
//        }
//
//        System.out.println(Arrays.toString(a3));


    }
}
