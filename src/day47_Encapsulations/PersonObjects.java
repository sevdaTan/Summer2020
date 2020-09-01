package day47_Encapsulations;

import java.time.LocalDate;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Kevser",33,'F', LocalDate.of(1987,9,19));

        System.out.println(person1);

        person1.setSsn(4325678);
        person1.setID(76556743);
        person1.setAddress("6547 allisonville road, fishers,IN 46038");

        System.out.println( person1.getSsn());
        System.out.println(person1.getID());
        System.out.println(person1.getAddress());


     //   Person person2 = new Person();

      //  Person person3 = new Person();




    }

}
