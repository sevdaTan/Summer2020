package day23_arrays;

import java.util.Scanner;

public class FrequencyOfCharacters_NestedLoop {
    /* INTERVIEW QUESTION
    3. write a program that can return the frequency of
     every single characters from the string:

			ex:
				str1 = "aabbccaa";

				output: a4b2c2


	HINT:
	easier approach:
	1. remove duplicates ==> str2 = "abc"
	2. then find each of str2' character' frequency
	in str1 ==> 4, 2, 2
	3. result: a4b2c2

	previous section we leaned how to find
	the frequency of one character.
	you will need to repeat the same steps
     */
    public static void main(String[] args) {

        String str = "ACCCAAWWWAANNNMMMBAB";
        String nonDuplicates =""; // "AB"
        String result = ""; //A2B2

        for (int i = 0; i < str.length()-1;i++){ // this for loop is for removing the duplicates from str
            String ch = "" + str.charAt(i);
            if(!nonDuplicates.contains(ch)){ // if(nonDuplicates.contains(ch){
                nonDuplicates += ch;        // continue;   } else{ nonDuplicates += ch }
            }
        }
       for (int j = 0;j <= nonDuplicates.length()-1;j++) { // iterates the String nonDuplicates

           char ch = nonDuplicates.charAt(j);
           int count = 0;
           for (int i = 0; i <= str.length() - 1; i++) { // returns the frequency of each ch from String
               if (str.charAt(i) == ch) {
                   count += 1;
               }
           }
           result += "" + ch + count;

       }

        System.out.println(result);
    }
}
