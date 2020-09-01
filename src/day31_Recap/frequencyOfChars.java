package day31_Recap;

import Library.Util;

public class frequencyOfChars {


    public static void main(String[] args) {

        String str = "AABBBCCC"; // A2B3C3

        String expectedResult = ""; // A2B3C3

        String nonDup = Util.removeDup(str);//ABC

        System.out.println(nonDup); // ABC


        for (char each : nonDup.toCharArray()) {
            int count1 = Util.frequency(str, each);
            expectedResult += "" + each + count1;

        }
        System.out.println(expectedResult);

        System.out.println("\n============\n");
        String str2 = "mmnjhyyuhgfd";
        String expectedResult2 = frequencyOfChars(str2);
        System.out.println(expectedResult2);
    }

     /*   char ch1 = nonDup.charAt(0); // A
        int count1  = Util.frequency(str,ch1); // 2
        expectedResult += ""+ ch1 + count1;

        System.out.println(expectedResult); // A2

        char ch2 = nonDup.charAt(1); // B
        int count2  = Util.frequency(str,ch2); // 3
        expectedResult += ""+ ch2 + count2;

        System.out.println(expectedResult); // B3


        char ch3 = nonDup.charAt(2); // C
        int count3  = Util.frequency(str,ch3); // 3
        expectedResult += ""+ ch3 + count3;

        System.out.println(expectedResult); // C3
*/


       /* for (char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += "" + each + count1;

        }
        System.out.println(expectedResult);
*/

     /*   for(int i = 0; i<nonDup.length();i++)

    {
        char ch = nonDup.charAt(i);
        int count = Util.frequency(str, ch);
        expectedResult += "" + ch + count;


    }
        System.out.println(expectedResult);
}
*/

    public static String frequencyOfChars(String str) {

        String nonDup = Util.removeDup(str);

        String expectedResult1 = "";
        for (int i = 0; i < nonDup.length(); i++) {
            char ch = nonDup.charAt(i);
            int count = Util.frequency(str, ch);
            expectedResult1 += "" + ch + count;

        }

        return expectedResult1;
    }

}
