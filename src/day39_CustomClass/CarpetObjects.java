package day39_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {
    public static void main(String[] args) {

        Carpet order1 = new Carpet();
        Carpet order2 = new Carpet();
        Carpet order3 = new Carpet();
        Carpet order4 = new Carpet();
        Carpet order5 = new Carpet();

        order1.setCarpetInfo(10,52,80,true);
        order2.setCarpetInfo(21,45,77,false);
        order3.setCarpetInfo(8,36,90,true);
        order4.setCarpetInfo(33,65,97,true);
        order5.setCarpetInfo(29,80,59,false);

        Carpet[] allCarpets = {order1,order2,order3,order4,order5};

       ArrayList<Carpet> persianCarpet = new ArrayList<>(Arrays.asList(allCarpets));
       persianCarpet.removeIf(p -> !p.isPersian);

//       ArrayList<Carpet> regularCarpet = new ArrayList<>(Arrays.asList(allCarpets));
//       persianCarpet.removeIf(p -> p.isPersian);

        for (Carpet each : persianCarpet){
            each.getCarpetInfo();
            each.calcCarpet();
        }

    }
}
