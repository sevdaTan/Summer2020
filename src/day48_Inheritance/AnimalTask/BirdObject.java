package day48_Inheritance.AnimalTask;

public class BirdObject {
    public static void main(String[] args) {

        Bird bird1 = new Bird("Lemon","Small",1,'M',"Weero",0.5);

        System.out.println(bird1.name);
        System.out.println(bird1.size);
        System.out.println(bird1.age);
        System.out.println(bird1.gender);
        System.out.println(bird1.breed);
        System.out.println(bird1.lb);

        bird1.fly();
        bird1.chirp();

        System.out.println(bird1);


    }


}
