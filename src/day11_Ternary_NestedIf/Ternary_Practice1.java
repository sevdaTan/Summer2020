package day11_Ternary_NestedIf;

public class Ternary_Practice1 {

    public static void main(String[] args) {

        int age2 = 15;
        boolean usCitizen = true;
        String eligibleVote = " ";

        if (age2 >= 18 && usCitizen){

            System.out.println("Eligibe to vote for Trump");
        }
        else {
            System.out.println("Not eligible to vote for Trump");
        }

        System.out.println("*************");

        String eligibleVote2 = (age2 > 18 && usCitizen) ? "yes" : "no";
        System.out.println(eligibleVote2);


        System.out.println("==========");

        int n1 = 100;
        int n2 = 200;

        String r  = (n1 == n2) ? "Equal" : "Not Equal";
        System.out.println(r);

        System.out.println("=============");





    }
}
