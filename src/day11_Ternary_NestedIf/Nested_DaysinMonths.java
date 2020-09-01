package day11_Ternary_NestedIf;

public class Nested_DaysinMonths {
/*
write a program that can find the number of days in a months
 */
    public static void main(String[] args) {

        int month = 12;
        boolean validNum = month >= 1 && month <= 12;
        boolean days28 = month == 2; // for the month that has 28 days
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;


        String result = " ";

        if (validNum){
            if(days28){
                result = "28 days";
            }else if (days30){
                result = "30 days";
            }else {
                result = "31 days";
            }

        }else{
            result = "Invalid result";

        }
        System.out.println(result);






    }
}
