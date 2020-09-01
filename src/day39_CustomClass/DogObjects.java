package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Brandy","Husky",
                "Big",2,"White");
        dog2.setDogInfo("Shi","Shibu Inu",
                "Medium",1,"Brown");
        dog3.setDogInfo("Max","Golden Retriever",
                "Small",3,"Light Brown");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Steak");
        dog2.eat("Biscuits");
        dog3.eat("Bone");

        dog1.drink("Milk");
        dog2.drink("Water");
        dog3.drink("Energy drink");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();

    }
}
