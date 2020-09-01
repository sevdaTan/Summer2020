package day36_ArrayList;

import java.util.ArrayList;

public class Set_Method {
    /*
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
     */
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);//0
        list1.add(20);//1
        list1.add(30);//2
        list1.add(40);//3
        list1.add(50);//4
        list1.add(60);//5
        list1.add(70);//6

        list1.set(list1.size()-1,0);

        System.out.println(list1);

        System.out.println("=============");

        /*
        2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
         */

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            list2.add(i);
        }
        System.out.println(list2);

        for (int i = 0; i <= list2.size()-1; i++){ //i = index number
            Integer each = list2.get(i);// each element in the list
            if(each % 2 != 0){
                list2.set(i, each * 2);
            }else{
                list2.set(i, each * 3);// if it is even number mult. by 3
            }
        }
        System.out.println(list2);

        System.out.println("=============");

/*
3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}
 */
        ArrayList<Integer> list = new ArrayList<>(); //{1,2,3,4,3,1}

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);

        ArrayList<Integer> uniques = new ArrayList<>();// {2,4}

        for (int i = 0; i <= list.size()-1; i++) { // gets each of the elements from the list

            Integer element = list.get(i);
            int count = 0;
            for (Integer each : list) { //finds the frequency of each element
                if (each == element) {
                    count++;
                }
            }
            if (count == 1) { // verify if the element is unique
                uniques.add(element);
            }
        }
        System.out.println(uniques);

    }
}
