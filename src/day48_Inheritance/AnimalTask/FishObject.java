package day48_Inheritance.AnimalTask;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class FishObject {
    public static void main(String[] args) {

        Fish fish1 = new Fish("Goldie", "small", 1, 'F', "Japanese Goldfish", 0.02, true);
        System.out.println(fish1.name);
        System.out.println(fish1.age);
        System.out.println(fish1.size);
        System.out.println(fish1.gender);
        System.out.println(fish1.breed);
        System.out.println(fish1.lb);
        System.out.println(fish1.hasGill);

        fish1.swim();
        System.out.println(fish1);
    }
}