package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('A','B','C','B','C','D','A','D'));

        System.out.println(list);

        ArrayList<Character> nonDup = new ArrayList<>();

        for( Character each : list){ //{'A','B','C','B','C','D','A','D'}

            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }

        System.out.println(nonDup);



    }

}
