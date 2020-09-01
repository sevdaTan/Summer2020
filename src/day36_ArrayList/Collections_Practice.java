package day36_ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Practice {
    /*
    {30,25,50,15}
    output = {50,30,25,15}
     */
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);//0
        list.add(50);//1
        list.add(20);//2
        list.add(40);//3
        list.add(10);//4

        Collections.sort(list);//10,20,30,40,50
        System.out.println(list);

        ArrayList<Integer>descendingList = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--){
            //System.out.print(list.get(i)+ " ");
            descendingList.add(list.get(i));
        }

        System.out.println(descendingList);




    }

}
