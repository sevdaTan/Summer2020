package day11_Ternary_NestedIf;

public class ternary {

    public static void main(String[] args) {

        int num = 189;
        String result = "";

        if (num % 2 == 0 ){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println( result);

        System.out.println("***********");

        String result2 = (num % 2 == 0 ) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("===================");

        int num1 = 101;
        int num2 = 20;
        int max1 = 0;

        if (num1 > num2){
            max1 = num1;
        }else{
            max1 =num2;
        }
        System.out.println(max1);

        System.out.println("**********");

        int max2 =   (num1 > num2) ? num1 : num2;
        System.out.println(max2);

        System.out.println("===============");

        // alcohol
        int age  = 22;
        boolean eligible = true;
        if (age > 21){
            eligible = true;
        }else{
            eligible = false;
        }
        System.out.println(eligible);

        System.out.println("***********");

        boolean eligible2 = (age > 21) ? true : false;
        System.out.println(eligible2);

        System.out.println("==============");

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


    }
}
