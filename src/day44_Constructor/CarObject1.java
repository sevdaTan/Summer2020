package day44_Constructor;

public class CarObject1 {

    public static void main(String[] args) {

       Car1 car1 = new Car1("Nissan", "Rogue","Gray",2015,8900 );
       Car1 car2 = new Car1("Toyota","Camry","Sky blue",2018,22980);
       Car1 car3 = new Car1("Ford", "Focus","Black", 2012,5988);
       Car1 car4 = new Car1("BMW", "X1", "Blue",2014,17999);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

    }


}
