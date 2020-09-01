package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {
    public static void main(String[] args) {

        /*
         create a class called carpetObjects, and create an
            array of the carpet that contains 5 carpet objects
            ( make sure you set the instance variables of those objects)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
            write a program to store all the persian Carpets into the
             list of persianCarpets, and store all regular carpets into
             the list of regularCarpets
                    use for each loop to print out all the persian carpets
         */

        Carpet[] carpets = {new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

        carpets[0].customOrder(2.2, 5.4, 11.4, true);
        carpets[1].customOrder(4.3, 5.4, 18.5, false);
        carpets[2].customOrder(2.9, 4.4, 16.5, false);
        carpets[3].customOrder(3.6, 7.4, 14.8, true);
        carpets[4].customOrder(1.8, 5.9, 25.5, true);

        for (Carpet eachCarpet : carpets) {
            eachCarpet.getCarpetInfo();
        }


        ArrayList<Carpet> persianCarpets = new ArrayList<>();
       persianCarpets.addAll(Arrays.asList(carpets));
       persianCarpets.removeIf(p -> !p.isPersian);

        ArrayList<Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        regularCarpets.removeIf(p -> p.isPersian);


        System.out.println("Number of Persian carpets: "+ persianCarpets.size());
        System.out.println("Number of regular carpets: "+ regularCarpets.size());


    }
}