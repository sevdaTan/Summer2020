package day39_CustomClass;

public class Car {

    /*
    Attributes:
            model,brand, color,year,mileage,price...
     */

    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

public void setCarInfo(String carBrand, String carModel, int carYear,
                    String carColor, double carMileage, double carPrice) {
    // sets the info of the car object
    brand = carBrand;
    model = carModel;
    year = carYear;
    color = carColor;
    mileage = carMileage;
    price = carPrice;
}
    public void getInfo(){
        System.out.println(year + " "+model+" "+year+" "+color + " "+ mileage+ " $" + price);
    }// prints the car info

    public void start(){
        System.out.println(brand + " "+ model+ " is started");
    }




}



