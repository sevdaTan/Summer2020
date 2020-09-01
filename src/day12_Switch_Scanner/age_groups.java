package day12_Switch_Scanner;

public class age_groups {
    /*
    2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

                  age cannot be negative or greater than 150

                  NOTE: MUST APPLY NESTED IF
     */
    public static void main(String[] args) {
     int age = 2;
     /*String r = (age > 0 && age < 21) ? "teenager":(age >= 21 && age < 55) ? "adult":
             (age >= 55 && age < 150) ? "senior": "invalid number";
        System.out.println(r); */
        String r = " ";

        if (age > 0 && age <= 150){
            if ( age < 21){
                r = "teenager";
            }else if (age >= 21 && age < 55){
                r = "adult";
            }else{
                r = "senior";
            }

        }else{
            r = "invalid age number";
        }
        System.out.println(r);







    }
}
