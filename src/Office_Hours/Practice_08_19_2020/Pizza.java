package Office_Hours.Practice_08_19_2020;

public class Pizza {
/*
1. Create a class named Pizza that stores information about a single pizza.
        Attributes:
            size, NumOfCheeseTopping, NumOfPepperoniTopping
        Actions:
            set(): sets all info of the pizza
            calcCost(): calculates the price and returns it as double
            toString(): returns a String containing the pizza size,
             quantity of each topping, and the pizza cost as
             calculated by calcCost()
            Pizza cost is determined by:
                    Small: $10 + $2 per topping
                    Medium: $12 + $2 per topping
                    Large: $14 + $2 per topping
*/

    static String size;
    static int NumOfCheeseTopping;
    static int NumOfPepperoniTopping;

    // argument
    public void set(String size, int NumOfCheeseTopping, int NumOfPepperoniTopping) {

        this.size = size;
        this.NumOfCheeseTopping = NumOfCheeseTopping;
        this.NumOfPepperoniTopping = NumOfPepperoniTopping;
    }

    public double calcCost() { // instance method

        int totalNumberOfTopping = NumOfCheeseTopping + NumOfPepperoniTopping;
        double totalPriceOfTopping = totalNumberOfTopping * 2;
        double totalPrice = totalPriceOfTopping;

        if (size.equalsIgnoreCase("small")) {
            totalPrice += 10;
        } else if (size.equalsIgnoreCase("medium")) {
            totalPrice += 12;
        } else {
            totalPrice += 14;
        }

        return totalPrice;
    }

        public String toString () {
            return "Size: " + size + "\nNumber of Cheese Topping: " + NumOfCheeseTopping +
                    "\nNumber of Pepperoni Topping: " + NumOfPepperoniTopping +
                    "\nTotal Price: " + calcCost();
        }

    }








