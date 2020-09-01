package day48_Inheritance.AnimalTask;

public class Bird extends Animal {

    public Bird(String name, String size, int age, char gender, String breed, double lb) {
        setInfo(name, size, age, gender, breed, lb);
    }
    public void fly(){
        System.out.println(name + " is flying");
    }
public void chirp(){
    System.out.println(name + " is chirping");
}


}