package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {
    public static void main(String[] args) {

         /*
        how many students made:
                A?
                B?
                C?
                D?
        how many failed?
        DO NOT use loop
         */

        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(50,77,99,61,65,90,98,55,69,74,88,66,55,82,91,44,76,80,23));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        gradeOfA.addAll(grades);
        gradeOfA.removeIf(p -> !(p >= 90 && p <= 100));// if grade is not >= 90, remove it
        System.out.println("Grade A: "+ gradeOfA);

        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        gradeOfB.addAll(grades);
        gradeOfB.removeIf(p -> !(p >= 80 && p < 90));
        System.out.println("Grade B: "+ gradeOfB);

        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        gradeOfC.addAll(grades);
        gradeOfC.removeIf(p -> !(p >= 70 && p < 80));
        System.out.println("Grade C:" + gradeOfC);

        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        gradeOfD.addAll(grades);
        gradeOfD.removeIf(p -> !(p >= 60 && p < 70));
        System.out.println("Grade D: "+ gradeOfD);

        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        gradeOfF.addAll(grades);
        gradeOfF.removeIf(p-> !(p >= 0 && p < 60));
        System.out.println("Grade F: " + gradeOfF);
        System.out.println("============");

        System.out.println(gradeOfA.size()+ " students made A");
        System.out.println(gradeOfB.size()+ " students made B");
        System.out.println(gradeOfC.size()+ " students made C");
        System.out.println(gradeOfD.size()+ " students made D");
        System.out.println(gradeOfF.size()+ " students failed");

        System.out.println("======================");
       ArrayList<Integer> list = new ArrayList<>();
        list.addAll( Arrays.asList(62, 63, 64, 66, 67 ,81, 82 ,100,90,85,75,55,45,73,73,35,47,60, 87, 77, 67, 57, 47, 93, 83, 73, 63, 53, 43) );

        System.out.println( list );


        ArrayList<Integer> gradeA = new ArrayList<>(); // 90 ~ 100
        gradeA.addAll( list ); // first store all the grades
        gradeA.removeIf( each ->  each < 90  ); // second remove the grades that are not A  (F, D, C, B)
                // only retain the grades of A
        System.out.println("Grade A: "+gradeA);


        ArrayList<Integer> gradeB = new ArrayList<>();  // 80 ~ 89
        gradeB.addAll( list ); // first store all the grades
        gradeB.removeIf( p -> p < 80  || p > 89 ); // second remove the grades that are not B  ( F, D, C, A)
                // if the grade is either less than 80 or greater 89 should be removed
        System.out.println("Grade B: "+gradeB);


        ArrayList<Integer> gradeC = new ArrayList<>(); //70 ~ 79
        gradeC.addAll(list); // first store all the grades
        gradeC.removeIf( p -> p < 70 || p > 79 ); // second remove the grades that are not C  ( F, D, B, A)
        System.out.println("Grade C: "+gradeC);


        ArrayList<Integer> gradeD = new ArrayList<>(); // 60 ~ 69
        gradeD.addAll(list);
        gradeD.removeIf( p -> p <60 || p > 69);
        System.out.println("Grade D: "+gradeD);


        ArrayList<Integer> gradeF = new ArrayList<>(); // 0 ~ 59
        gradeF.addAll(list);
        gradeF.removeIf( p -> p > 59);


        gradeF.removeAll( gradeA );
        gradeF.removeAll( gradeB );
        gradeF.removeAll( gradeC );
        gradeF.removeAll( gradeD );


        System.out.println("Grade F: "+gradeF);

        System.out.println("=========================================");
        System.out.println( gradeA.size()+" students made A" );
        System.out.println( gradeB.size()+" students made B" );
        System.out.println( gradeC.size()+" students made C" );
        System.out.println( gradeD.size()+" students made D" );
        System.out.println( gradeF.size()+" students failed" );






    }
}
