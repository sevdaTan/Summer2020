package day39_CustomClass;

public class CarMax {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setCarInfo("Lexus","RX350",2019,
                        "White",14000,45000);

        car2.setCarInfo("Lexus","RX450",2020,
                "Purple",1000,55000);

        car3.setCarInfo("Bugatti","Veyron",2016,
                "Black",114000,25500);

        car4.setCarInfo("Ford","Escape",2013,
                "Blue",141000,15000);

        car5.setCarInfo("Nissan","GT-R",2015,
                "Silver",74000,14700);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car3.start();
        car5.start();

    }
}
