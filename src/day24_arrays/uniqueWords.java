package day24_arrays;

public class uniqueWords {
    public static void main(String[] args) {
      //write a program that can find the unique words from a sentence
        String[] words = {"Today","is","Java","day",". ","Today","is","not","Python","day"};


       for (int j = 0; j <= words.length-1; j++) {
           String s =  words[j];
           int count = 0; // to assign the frequency of s

           for (int i = 0; i <= words.length - 1; i++) {
               String each = words[i];
               if (s.equals(each)) {
                   count++;
               }
           }
           if (count == 1) {
               System.out.println(s + " ");

           }
       }

    }
}
