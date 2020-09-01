package day48_Inheritance.AnimalTask;

public class Fish extends Animal{

    public boolean hasGill = true;
    public Fish(String name, String size, int age, char gender, String breed, double lb, boolean hasGill) {
        setInfo(name, size, age, gender,breed,lb);
        this.hasGill = hasGill;
    }
    public void swim(){
        System.out.println(name + " is swimming");
    }
}