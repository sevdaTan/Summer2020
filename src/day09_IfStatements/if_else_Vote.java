package day09_IfStatements;

public class if_else_Vote {

    public static void main(String[] args) {

        int age = 35;
        boolean usCitizen = true;

        if (age >= 18 && usCitizen){

            System.out.println("Eligibe to vote for Trump");
        }
        else {
            System.out.println("Not eligible to vote for Trump");
        }



    }



}
