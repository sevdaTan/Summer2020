package day44_Constructor;

    public class Car1 {

          String brand;
          String model;
          String color;
          int year;
          double price;

         static boolean hasDoor = true;
         static boolean hasWiper = true;
         static boolean hasSeat = true;
         static boolean hasSeatBelt = true;



         public Car1(String brand, String model, String color, int year, double price){

             this.brand = brand;
             this.model = model;
             this.color = color;
             this.year = year;
             this.price = price;

         }
        public String toString(){
             return "Brand: " + brand + ", Model: " + model + ", Color: " + color + ", " +
                     "Year: " + year + ", Price: $" + price + ", Has Doors: " + hasDoor + ", " +
                     "Has Wipers: " + hasWiper + ", Has Seat: " + hasSeat + ", Has Seat Belt: " + hasSeatBelt;
        }

}
