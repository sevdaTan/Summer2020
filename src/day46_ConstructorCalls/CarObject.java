package day46_ConstructorCalls;

public class CarObject {
    public static void main(String[] args) {

        System.out.println(new Car("Nissan") );

        System.out.println("=============");

        System.out.println(new Car("Nissan","Rogue"));

        System.out.println("=============");

        System.out.println(new Car("Nissan","Rogue","Gray"));

        System.out.println("=============");

        System.out.println(new Car("Nissan","Rogue","Gray",2012)) ;

        System.out.println("=============");

        System.out.println(new Car("Nissan","Rogue","Gray",2012,9800));



    }
}
