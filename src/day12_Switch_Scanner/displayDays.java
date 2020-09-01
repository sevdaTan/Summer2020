package day12_Switch_Scanner;

public class displayDays {
    public static void main(String[] args) {

        int num = 6;
        String r = " ";
        switch (num){

            case 1 :
                r ="Monday";
            break;

            case 2:
                r ="Tuesday";
            break;

            case 3:
                r ="Wednesday";
             break;

            case 4 :
                r ="Thursday";
                break;

            case 5:
                r ="Friday";
                break;

            case 6:
                r = "Saturday";
                break;
            case 7:
                r ="Sunday";
                break;

            default:
               r ="Invalid number";
               break;

        }
        System.out.println(r);
    }
}
