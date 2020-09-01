package day11_Ternary_NestedIf;

public class ternary_practice2 {

    public static void main(String[] args) {

        // ? means = if, : means = else

        // multi-branch if
        // positive / negative / zero

        int num = 100;
        String result = "";

        if(num > 0){
            result = "Positive";
        } else if(num < 0){
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);

        System.out.println("********");

        int num2 = 10;

        String res = (num2 > 0)  ? "Positive" : (num2 < 0) ? "Negative" : "Zero";

        System.out.println(res);

        System.out.println("============");

        //write a program that compare 2 numbers

        int a = 8;
        int b = 8;
        String r1= (a > b) ? "a is greater" : (b > a) ? "b is greater" : "a is equal to b";
        System.out.println(r1);


    }

}
