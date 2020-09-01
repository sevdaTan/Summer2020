package day11_Ternary_NestedIf;

public class Nestedif_Loan {

    public static void main(String[] args) {

        /*
        precondition: min. salary of 30K
              sub-condition: min 2 year job history
         */

        double salary = 120_000;
        int jobHistory = 11;
        String r1 = " ";


        if (salary >= 30_000 ){
            if (jobHistory >= 2){
                r1 = "You are qualified!";
            }else{
                r1 = "You must have been on that job at least 2 years.";
            }

        }else{
            r1 = "You must earn at least $30K";
        }
        System.out.println(r1);








    }


}
