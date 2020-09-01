package day09_IfStatements;

public class eligible_alcohol {
    /*
    write a program that can identify if
     a person is eligible to buy alcohol
     */

    public static void main(String[] args) {

        boolean hasID = true;
        int eligible_age = 21;
        int age = 47;

        boolean eligible = hasID && age >= eligible_age;

        String result = "";
        if(eligible == true){
            //System.out.println("You are eligible to buy alcohol");
            result = "You are eligible to buy alcohol";
        }

        if(eligible == false){
            //System.out.println("You are NOT eligible to buy alcohol");
            result = "You are NOT eligible to buy alcohol";
        }
        System.out.println(result);




    }



}
