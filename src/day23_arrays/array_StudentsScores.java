package day23_arrays;

public class array_StudentsScores {
    public static void main(String[] args) {

        int[] scores = {85,70,95,90,100};
        String[] names = {"Mike", "Adam","Tonny", "John","Amy" };
/*
        System.out.println(names[0] +" :"+ scores[0]);
        System.out.println(names[1] +" :"+ scores[1]);
        System.out.println(names[2] +" :"+ scores[2]);
        System.out.println(names[3] +" :"+ scores[3]);
        System.out.println(names[4] +" :"+ scores[4]); */

        for (int i = 0; i <= 4; i++){
            System.out.println(names[i] +" :"+ scores[i]);
        }
        System.out.println();
        System.out.println("===============");
        System.out.println();

        String[] classMates = new String[6]; // String [] kismi bossa "null" yazisi cikar.
        classMates[0] = "Quyen";
        classMates[2] = "Hung";
        classMates[1] = "Jika";
        classMates[3] = "Merfu";
        classMates[4] = "Gulseda";
        classMates[0] = "Muhtar";

        for (int i = 0; i <= classMates.length - 1; i++){
            System.out.println(classMates[i]);






        }

    }
}
