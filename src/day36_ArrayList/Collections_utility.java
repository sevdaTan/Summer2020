package day36_ArrayList;
import java.util.ArrayList;
import  java.util.Collections;
public class Collections_utility {
    /*
    Arrays: utility class for array
    Collections: utility for collection
     */

    public static void main(String[] args) {
// sort method
        ArrayList<Integer> list = new ArrayList<>();

        list.add(60);//0
        list.add(40);//1
        list.add(30);//2
        list.add(10);//3
        list.add(50);//4
        list.add(20);//5

        Collections.sort(list);

        System.out.println(list);

        System.out.println("Maximum number: " + list.get(list.size()-1));
        System.out.println("Minimum number: " + list.get(0));

        System.out.println("===========");

        // SWAP method

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);

        Collections.swap(list2, 1,  2); //{A, C, B, D, E};

        System.out.println(list2);


        Collections.swap(list2, 0, list2.size()-1); //{E, C, B, D, A};

        System.out.println(list2);

        System.out.println("==========");

        //frequency method

        ArrayList<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('A');
        charList.add('C');

        int count =  Collections.frequency(charList, 'B');

        System.out.println(count);







    }


}
