package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Collection_Utility {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A','R','D','Y','G','M','L'));
        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);

        System.out.println("=============");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Kevser","Busra","Ayse","Samir","Fatih","Sardor","Sevda","Jika"));

        Collections.swap(students,1,5);
        Collections.swap(students,2,3);
        Collections.swap(students,0,students.size()-1);

        System.out.println(students);

        System.out.println("================");

        ArrayList<String> items = new ArrayList<>();
        items.addAll(Arrays.asList("Battery","Coffee","Battery","Butter","Book","Battery","Butter","Book","Battery"));
        int count = Collections.frequency(items,"Battery");
        System.out.println(count);

        ArrayList<String> unique = new ArrayList<>();

        for(String each : items){
          int howMany = Collections.frequency(items, each);

          if(howMany == 1){
              unique.add(each);
          }
        }
        System.out.println(unique);

        ArrayList<String> unique2 = new ArrayList<>();
        unique2.addAll(items);
        unique2.removeIf(p -> Collections.frequency(unique2,p) > 1);
        System.out.println(unique2);

        System.out.println("===========");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9, 89, 1000, 2000, 3000, 30, 40, -50, 1000, 1000, 1000, 1000));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("max: "+max);
        System.out.println("min: "+min);

        Collections.replaceAll(list, 1000, 100000 );

        System.out.println(list);










    }
}
