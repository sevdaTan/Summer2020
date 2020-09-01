package Office_Hours.Practice_08_24_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Recap {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println(list1); // []
        list1.addAll(Arrays.asList(1,2,3,4,5));

        System.out.println(list1);

        for (int each : list1){
            System.out.println(each);
        }

        System.out.println("==========");
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(100,200,300,400,500,90,40));

        list2.removeAll(Arrays.asList(40,500,40,90));
        System.out.println(list2);

        Collections.swap(list2,0, list2.size()-1);
        System.out.println(list2);

        System.out.println(list2.get(0));
        System.out.println(list2.get(list2.size()-1));

        list2.set(0,80);
        System.out.println(list2);

        System.out.println("=======");
        Collections.sort(list2);
        System.out.println(list2);

        System.out.println("=======");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Sevda","Kevser","Jika","Nurbiye","Hatice"));
        names.removeIf(p -> p.equals("Nurbiye"));
        System.out.println(names);

    }
}
