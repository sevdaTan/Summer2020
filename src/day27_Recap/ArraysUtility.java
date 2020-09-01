package day27_Recap;

import java.util.Arrays;

public interface ArraysUtility {
    public static void main(String[] args) {

      /*
      sort():
      toString();
      equals();
      deepToString();
       */
       String[] names = {"Sevda","Busra","Quyen","Merfu","Jika","Gulseda"};

        Arrays.sort(names);
        System.out.println(Arrays.toString(names) );

        System.out.println("============");

        int[] score= {45,78,90,53,22,67,88,59};
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));

        System.out.println("Maximum score: " + score[score.length-1]);
        System.out.println("Minimum score: " + score[0]);


        System.out.println("==============");

        String[] a1 = {"A","B","C"};
        String[] a2 = {"A","B","C"};

        System.out.println(Arrays.equals(a1,a2)); //true

        String[] s1 = {"A","C","B"};
        String[] s2 = {"C","B","A"};

        System.out.println(Arrays.equals(s1,s2)); // false


        String[] b1 = {"A","C","B"};
        String[] b2 = {"C","B","A"};

        Arrays.sort(b1); // A B C
        Arrays.sort(b2); // A B C

        System.out.println(Arrays.equals(b1,b2));


        String w1 = Arrays.toString(b1);
        System.out.println(w1);


    }
}
