package day34_WrapperClass;

import java.util.ArrayList;

public class List_2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(122);
        list.add(112);
        list.add(121);
        list.add(212);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer each : list){
            if(each > max){
                max = each;
            }
            if(each < min){
                min = each;
            }
        }

        System.out.println("max : "+ max);
        System.out.println("min : "+ min);


    }


}
