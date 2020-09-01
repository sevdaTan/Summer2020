package day39_CustomClass;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();

           /*
             car1.brand = "Toyota";
             car1.model = "Corolla";
             car1.year = 2020;
             car1.color = "Blue";
             car1.mileage = 12.234;
             car1.price = 22.435;
*/

        car1.setCarInfo("Toyota","Corolla",2020,
                "Blue",19321,23879);

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);
        System.out.println(car1.mileage);
        System.out.println(car1.price);

        System.out.println("==========");

       Car car2 = new Car();

      /*  car2.brand = "Audi";
        car2.model = "Q6";
        car2.year = 2018;
        car2.color = "Black";
        car2.mileage = 22.234;
        car2.price = 38.435; */

        car2.setCarInfo("Audi","A4",2019,
                "Sky Blue",32877,39899);

        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);
        System.out.println(car2.mileage);
        System.out.println(car2.price);

        System.out.println("=========");

        Car car3 = new Car();
        car3.setCarInfo("Nissan","Rogue",2012,
                     "Gray",96877,7450);
//        System.out.println(car3.brand);
//        System.out.println(car3.model);
//        System.out.println(car3.year);
//        System.out.println(car3.color);
//        System.out.println(car3.mileage);
//        System.out.println(car3.price);
                car3.getInfo();

        System.out.println("========");

       Car car4 = new Car();

        car4.setCarInfo("Ford","Focus",2016,
                "Green",66877,11450);

       car4.getInfo();




    }
}
