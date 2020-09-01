package day48_Inheritance.AnimalTask;

public class Dog extends Animal {
    // subClass(child) ~ superClass(parent)
    /*
    variables: 6 // name, size, age,gender, breed,lb
    methods: 5 (we also count the animal class methods)
     */
    public Dog(String name, String size, int age, char gender,String breed, double lb){
        setInfo(name, size,age,gender,breed,lb);
    }
    public void bark(){
        System.out.println(name + " is barking"); // since we declared "name" in
                                     // Animal class, no need to declare it again
    }


}
