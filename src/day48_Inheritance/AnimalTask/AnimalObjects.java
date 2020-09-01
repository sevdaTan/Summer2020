package day48_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("ChiiChan","small",2,'M',"Shibainu", 2.6);
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1.breed);
        System.out.println(dog1.lb);

        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1);
    }

}
