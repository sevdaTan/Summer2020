package day11_Ternary_NestedIf;

public class NestedIf_days {

    public static void main(String[] args) {

          /*
        1-Monday
        2-Tuesday
        3-Wednesday
        ...
        7-Sunday
        invalid ==> there is no such a day
         */

        int day = 3;
        String name = " ";

        if(day >= 1 && day <= 7) {
           /* if(day == 1){
                name = "Monday ";
            }else if(day == 2){
                name = "Tuesday ";
            }else if(day == 3){
                name = "Wednesday ";
            }else if(day == 4){
                name = "Thursday ";
            }else if(day == 5){
                name = "Friday ";
            }else if(day == 6){
                name = "Saturday ";
            }else{
                name = "Sunday ";
            }

       */
            name = (day == 1) ? "Monday " :  (day == 2) ? "Tuesday " :
                     (day == 3) ? "Wednesday " :
                    (day == 4) ? "Thursday " : (day == 5) ? "Friday" :
                    (day == 6) ? "Saturday " : "Sunday";
        }else{
          name = "There is no such a day!";
        }
        System.out.println(name);





    }
}
