package day44_Constructor;

public class Dog1 {

    String name;
    int age;
    String breed;
    String color;
    String size;
    static String eating = "Beef & Bone";
    static String drink = "Water";
    static String play = "A lot";
    static String sleep = "Whole Night";


    public Dog1(String name, int age, String breed, String color,String size){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.size = size;

    }
    public String toString(){
        return "Name: "+ name + ", Age: "+ age + ", Breed: "+ breed + "" +
                ", Color: "+ color + ", Size: " + size + ", Eats: "+ eating+ "" +
                ", Drinks: "+ drink + ", Plays: " + play + ", Sleeps: " + sleep;
    }



}
