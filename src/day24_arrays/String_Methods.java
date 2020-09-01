package day24_arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {

        String str = "abcdefghijklmno";
        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println("=============");
     // ayni harfleri icerip icermedigini karsilastiriyoruz. sort yapiyoruz
         String str1 = "EHYTDF";
         String str2 = "MNHJUK";

        char[] ch1 = str1.toCharArray();// E,H,Y,T,D,F
        char[] ch2 = str2.toCharArray(); // M,N,H,J,U,K

        Arrays.sort(ch1); // D,E,F,H,T,Y
        Arrays.sort(ch2); //  D,E,F,H,T,Y

        boolean r1 =Arrays.equals(ch1,ch2);
        System.out.println(r1);
        System.out.println("============");
        //split method = bolmek
        String sentence = "I love Programming Language";//Language Programming love I
        String[] words = sentence.split(" ");// I, love, Programming, Language
        System.out.println(Arrays.toString(words));
        for(int i = words.length-1; i >= 0; i--) {
            System.out.print(words[i]+ " ");
        }
        System.out.println();
        System.out.println("==========");
        System.out.println();

        String s = "JAVA";
        String[] arr = s.split(""); // every single elements are string
        System.out.println(Arrays.toString(arr));

      char[] c = s.toCharArray();




    }
}
