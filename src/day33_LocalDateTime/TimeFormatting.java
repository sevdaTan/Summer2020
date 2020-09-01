package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
//days name =  E (3 letters of tha day name)
        // EEEE = prints the entire name of the day
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E,MM/dd/yyyy" );
// MM = sayi olarak print eder
// MMM = ilk 3 harfi print eder
// MMMM = Ayin adini print eder
        LocalDate ld  =LocalDate.of(2020,7,25);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat) );

        //hours = hh
        //minutes = mm
        // seconds = ss
        // am/pm = a

        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:a");
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.format(timeFormat));


        //May / 20/ 2019 DayName / 4:30 pm

        DateTimeFormatter DTFormat= DateTimeFormatter.ofPattern("MMM/dd/yy EEEE hh:mm: a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20,16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));

        System.out.println("=======");

        // Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime Now = LocalDateTime.now();
        System.out.println(Now);
        System.out.println(Now.format(dtf));


    }
}
