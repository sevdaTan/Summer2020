package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {

       LocalTime t1 = LocalTime.of(16,58,44);
        System.out.println(t1);

        LocalTime t2 = LocalTime.now();
        System.out.println(t2);

        LocalDateTime t3 = LocalDateTime.of(2020,07,25,15,39);
        System.out.println(t3);

        LocalDateTime t4 = LocalDateTime.now();
        System.out.println(t4);



    }
}
