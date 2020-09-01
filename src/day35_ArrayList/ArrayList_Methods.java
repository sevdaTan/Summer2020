package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {
    public static void main(String[] args) {
// when we want to change one element to another one we use
// "set method". it doesn't change the array's size.
// Just updates the chosen element.
        ArrayList<String> earlyBirdList = new ArrayList<>();
                 earlyBirdList.add("Sevda");
                 earlyBirdList.add("Samir");
                 earlyBirdList.add("Busra");
                 earlyBirdList.add("Sardor");
                 earlyBirdList.add("Merfu");
                 earlyBirdList.add("Jika");

                 earlyBirdList.set(5,"Quyen");
                 earlyBirdList.set(4,"Fatih");
                 System.out.println(earlyBirdList);

        System.out.println("===========");

        // clear method clears all the list
        earlyBirdList.clear();
        System.out.println(earlyBirdList);

        System.out.println("==============");
         // remove method decrease the size of the arraylist
        // removes method removes only one element
        //remove method(int index ) ==> primitive
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);//0
        List.add(2);//1
        List.add(3);//2
        List.add(4);//3
        List.add(5);//4

        System.out.println(List);

        List.remove(2); //1,2,4,5
        System.out.println(List);

        List.remove(3); // 1,2,4
        System.out.println(List);

        System.out.println("===============");

        //remove (element) //removes the element itself
        // removes method ==> this method removes only one element
        ArrayList<Integer> List1 = new ArrayList<>();
        List1.add(1);//0
        List1.add(2);//1
        List1.add(3);//2
        List1.add(4);//3
        List1.add(5);//4

        Integer a = 1;
        List1.remove(a); // if we don't pass the element to primitive,
        // the element will be removed. not the index, element itself
       //it returns BOOLEAN
        System.out.println(List1);

        System.out.println("===========");

        ArrayList<String> List2 = new ArrayList<>();
        List2.add("Sevda");//0
        List2.add("Kevser");//1
        List2.add("Busra");//2
        List2.add("Ayse");//3
        List2.add("Aalia");//4

        List2.remove(4); // removing primitives
        List2.remove("Ayse"); // removing non-primitives
        boolean r = List2.remove("sevda");
        System.out.println(List2);
        System.out.println(r);
        boolean r2 = List2.remove("Sevda");
        System.out.println(r2);


    }
}
