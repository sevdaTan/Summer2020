package day42_Static;

public class Car {

    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;

    static boolean hasWheel=true;
    static int numberOfTires =4;
    static boolean hasEngine=true;
    static boolean hasDoors=true;
    static boolean hasAirbag=true;
    static boolean hasSeatBelt=true;
    static boolean hasHorn=true;

public void start(){
    System.out.println("Starting " + brand + " "+ model);
}
     public static void printTires(){
         System.out.println(numberOfTires + "Tires" );
     }

     //STATIC only accepts STATIC

public String toString(){
    return "Brand: "+ brand + ", Model: " + model+ ", Year: "+ year + ", Color: "+color
            +"\n Number of Tires: "+ numberOfTires+ "\nHas Engine: "+hasEngine+ "" +
            "\n Has Wheel: "+hasWheel+ "\nHas Airbags: "+ hasAirbag;
}

}
