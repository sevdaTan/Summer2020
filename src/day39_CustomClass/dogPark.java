package day39_CustomClass;

public class dogPark {
    public static void main(String[] args) {
        //dogPark

        Dog[] dogPark = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog() };

        dogPark[0].setDogInfo("Brandy","Husky",
                "Big",2,"White");
        dogPark[1].setDogInfo("Shi","Shibu Inu",
                "Medium",1,"Brown");
        dogPark[2].setDogInfo("Winston", "Scotties Terrier",
                "Small", 1, "Black");
        dogPark[3].setDogInfo("Roofus", "Argentinian Dogo",
                "Large", 1, "White");
        dogPark[4].setDogInfo("Siwan","Beagle",
                "medium",2,"Mix");

        for (int i = 0; i <= dogPark.length-1; i++){
            dogPark[i].getDogInfo();
        }
        System.out.println("=====================");

        for ( Dog eachDog : dogPark){
            eachDog.getDogInfo();
        }
        System.out.println("=================");

        String food = "Treats";
        for (Dog eachDog : dogPark){
            eachDog.eat(food);
        }

        System.out.println("===================");

        String drink = "Milk";
        for( Dog eachDog  : dogPark ){
            eachDog.drink(drink);
        }

        System.out.println("=================");


        for( Dog eachDog  : dogPark ){
            eachDog.play();
        }

        System.out.println("===================");

        for( Dog eachDog  : dogPark ){
            eachDog.sleep();
        }


    }
}
