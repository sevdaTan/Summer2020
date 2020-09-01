package day44_Constructor;

public class DogObject1 {

    public static void main(String[] args) {

        Dog1 dog1 = new Dog1("SLack", 12,"Golden Retriever", "Golden Brown","Large");
        Dog1 dog2 = new Dog1("Zoom", 10,"Shiba inu", "Golden Brown","Medium");
        Dog1 dog3 = new Dog1("Ninja",12,"Siberian Husky","Gray & White","Medium");
        Dog1 dog4 = new Dog1("Lucky",2,"Havanese","White","Small");
        Dog1 dog5 = new Dog1("Happy",1,"Rough Collie","Golden Brown & White","Large");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
    }

}
