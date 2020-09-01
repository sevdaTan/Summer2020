package day23_arrays;

public class Shopping_arrays {
    public static void main(String[] args) {

        String[] shoppingList = new String[7];

        shoppingList[0] = "Tomato";
        shoppingList[5] = "Shampoo";
        shoppingList[5] = "Eggs";
        shoppingList[6] = "Milk";
        shoppingList[3] = "Chips";
        shoppingList[1] = "Chocolate";
        shoppingList[4] = "Broccoli";

        for (int i = 0; i <= shoppingList.length - 1; i++) {

            System.out.println(shoppingList[i]);
        }

    }
}
