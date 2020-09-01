package day26_MultidimensionalArray;

import java.util.Arrays;

public class MultiD_Array_Practice {
    public static void main(String[] args) {

        /*
        tester: {"Sevda","Kevser","Busra"}
        developer: {"Samir","Fatih","Sardor","Hung"}
        SM: {"Muhtar"}
        PO: {"Nadir"}
        BA: {"Asiya"}

        scrumTeam: testers, developers, PO,BA,SM
         */
        String[] testers = {"Sevda","Kevser","Busra"};
        String[] developers = {"Samir","Fatih","Sardor","Hung"};
        String[] SM = {"Muhtar"};
        String[] PO = {"Nadir"};
        String[] BA = {"Asiya"};

        String[] testers2 = {"Cihan","Hasan","Hakan"};


       String[][] scrumTeam = {testers,developers,SM,PO,BA};
       scrumTeam [4][0] = "Ayse"; // bu sekilde tek tek replace yapiliyor
       scrumTeam [1][3] = "Quyen";
       scrumTeam [3][0] = "Asiya";
       scrumTeam[0] = testers2; // grubu tamamen degistiriyoruz bu sekilde

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("==========");

        // loop ile print etme

        for (String[] each : scrumTeam ){
            for (String name : each){
                System.out.println(name);
            }
            System.out.println(Arrays.toString(each));
        }
        System.out.println("===========");
        //print out the numbers that divisible by 3 or 5
        int[][] scores = {{10,14,20,30,45},{60,58,75,105},{93,19,48,125,135}};

        for(int[] each1D_array : scores){
            for (int eachElement :each1D_array){
                //System.out.print(eachElement  + " "); // tum sayilari yazar

           if (eachElement %3 == 0 || eachElement %5 == 0){ // bolunebilenleri print ediyor sadece
               System.out.print(eachElement  + " ");
           }

            }

        }



    }
}
