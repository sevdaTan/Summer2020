package day47_Encapsulations;

import java.util.ArrayList;

public class StaticBlock {

    //static String companyName = "Bank of America";

    static String companyName;

    static ArrayList<Integer> list;
//    list.add(10);
//    list.add(20);
//    list.add(30);

    static {
        companyName = "Bank of America";
        list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
    }

    public static void main(String[] args) {
        System.out.println(companyName);
        System.out.println(list);
    }

}
