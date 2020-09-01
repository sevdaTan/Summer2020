package Office_Hours.Practice_07_27_2020;

import java.util.Arrays;

public class Combine2Arrays_3 {
    public static void main(String[] args) {

        String[] a1 = {"Sevda" , "Busra", "Kevser","Merfu"};
        String[] a2 = {"Emrah" , "Enes", "Erkan","Burak"};

      String[] students = new String[a1.length + a2.length];

      for(int i = 0; i < a1.length; i++){
          students[i] = a1[i];
      }for(int j = 0; j < a2.length; j++){
            students[j + a1.length] = a2[j];
        }

        System.out.println(Arrays.toString(students));

    }
}
