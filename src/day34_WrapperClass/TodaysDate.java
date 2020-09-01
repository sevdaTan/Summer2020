package day34_WrapperClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TodaysDate {

    public static void main(String[] args) {

       //Sunday, 09:51 AM, Jul/26/2020

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");

         LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        System.out.println(today.format(dtf));



    }

}
