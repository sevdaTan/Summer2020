package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Methods {
    public static void main(String[] args) {
  // remove, size, set, get, equals, contains, clear

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Tesla", "Mercedes","Tesla","Infinity","Nissan","Toyota","Ford", "Tesla","WV", "Lamborghini","Lexus"));

        // cars.remove(3); // one way to remove is calling with index number
        // cars.remove("Tesla"); // second way to remove is calling with object name -> it removes the first matching element

        // cars.removeAll(Arrays.asList("Tesla"));// removes all the matching elements

       // cars.removeIf(p -> p.toLowerCase().contains("m"));
    // removes all the elements that are matching with the condition

     cars.retainAll(Arrays.asList("Nissan","BMW"));
     // remove all the elements NOT matching

        System.out.print(cars + " ");

        System.out.println();
        System.out.println("================");

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Toilet Paper","Bread","Water","Juice","Mango","Avocado","Apple","Banana"));

    //pepsi
     boolean r1 = groceryList.contains("Pepsi");
        System.out.println(r1);// False

     // egg , milk , mango
     boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Milk","Mango"));
        System.out.println(r2); // True

        // egg , milk , mango , orange
        boolean r3 = groceryList.containsAll(Arrays.asList("Egg","Milk","Mango", "Orange"));
        System.out.println(r3);// False

        System.out.println("Total number of items " + groceryList.size());

        // banana to pear
        groceryList.set(groceryList.size()-1, "Pear");
        System.out.println(groceryList);

        // set toilet paper to toothpaste
        groceryList.set(groceryList.indexOf("Toilet Paper"),"Toothpaste");
        System.out.println(groceryList);

        //clears everything / returns empty
        groceryList.clear();
        System.out.println(groceryList);





    }
}
