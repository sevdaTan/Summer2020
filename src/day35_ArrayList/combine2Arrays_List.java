package day35_ArrayList;

import java.util.ArrayList;

public class combine2Arrays_List {
    /*
    3. write a program that can combine two
     String arrays into one arrayList
            ex:
           arr1 = {"A", "B", "C"};
           arr2 = {"D", "E", "F", "G"};
           list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Mohammed", "Aslan", "Ernis"};
        String[] group2 = {"Zarina", "Mee", "Irina", "Virginia", "Ali", "Dawud"};

        ArrayList<String> studentList = new ArrayList<>();

        for(String each : group1){
            studentList.add(each);
        }

        for( String each: group2){
            studentList.add(each);
        }

        System.out.println( studentList );


    }

}
