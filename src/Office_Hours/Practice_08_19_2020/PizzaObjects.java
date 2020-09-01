package Office_Hours.Practice_08_19_2020;

import java.util.ArrayList;

public class PizzaObjects {

    public static void main(String[] args) {

        ArrayList<Pizza> pizzaForB20= new ArrayList<>();

        for(int i = 0; i < 400; i++) {
            Pizza myPizza = new Pizza();
            myPizza.set("Large", 3, 2);
            pizzaForB20.add(myPizza);

        }
        System.out.println("Total Number of Pizza: "+ pizzaForB20.size());
        double totalPrice = 0;

        for (Pizza each : pizzaForB20){
         totalPrice += each.calcCost();

        }
        System.out.println("Total Price: " + totalPrice);

        System.out.println("============");

        Pizza pizza1 = new Pizza();
        pizza1.set("Large",3,5);

        System.out.println("Muhtar's Pizza: $" + pizza1.calcCost());

        Pizza pizza2 = new Pizza();
        pizza2.set("Small",2,4);

        System.out.println("Saim's Pizza: $" + pizza2.calcCost());

    }
}
