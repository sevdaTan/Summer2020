package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {

        String[] friends = {"Busra","Quyen","Jika","Merfu","Kevser"};
        LocalDate[] birthdays = {
            LocalDate.of(1993, 7,15),
                LocalDate.of(1990, 8,22),
                LocalDate.of(1989, 7,5),
                LocalDate.of(1988, 9,6),
                LocalDate.of(1987, 9,22),
        };
for(int i = 0; i <= friends.length-1; i++) {
    System.out.println(friends[i] + " : "+ birthdays[i]);

}
      System.out.println("===========");

for(LocalDate each : birthdays){
    if(!each.isLeapYear()){
        continue;
    }
    System.out.println(each);


}


    }
}
