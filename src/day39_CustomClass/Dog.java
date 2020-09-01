package day39_CustomClass;

public class Dog {

    String name;
    String breed;
    String size;
    int age;
    String color;

    // sets the dog info
    public void setDogInfo (String dogName, String dogBreed, String dogSize,int dogAge,String dogColor){ name = dogName;
       breed = dogBreed;
       size = dogSize;
       age = dogAge;
       color = dogColor;
    }
    // prints the dog info
    public void getDogInfo(){
        System.out.println("Name: "+name +", Breed: " +breed +", Size: "+size+ ", Age: "+ age + ", Color: "+ color);
    }

    public void eat(String food){
        System.out.println(name + " eats "+ food);

    }

    public void drink(String drink){
        System.out.println(name + " drinks "+ drink);
    }

    public void sleep(){
        System.out.println(name + " sleeps a lot");
    }

    public void play(){
        System.out.println(name+" is playing");
    }


}
