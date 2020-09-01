package day48_Inheritance.AnimalTask;

public class CatObject {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Mini","Medium",1,'F',"Parsian", 2.3);
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.size);
        System.out.println(cat1.gender);
        System.out.println(cat1.breed);
        System.out.println(cat1.lb);

        cat1.meow();
        cat1.eat();
        cat1.sleep();

        System.out.println(cat1);

    }


}
