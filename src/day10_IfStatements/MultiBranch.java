package day10_IfStatements;

public class MultiBranch {

    public static void main(String[] args) {

        int num = 100;

        if (num > 0){
            System.out.println(num + " is positive");
        }
        if (num < 0){
            System.out.println(num + " is negative");
        }
        if(num == 0){
            System.out.println(num +" is zero");
        }

        System.out.println("***************");

        if (num > 0){
            System.out.println(num + " is positive");
        }else if (num < 0){
            System.out.println(num + " is negative");
        }else {
            System.out.println(num + " is zero");
        }





    }


}
