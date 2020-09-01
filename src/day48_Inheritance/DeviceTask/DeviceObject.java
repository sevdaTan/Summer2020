package day48_Inheritance.DeviceTask;

public class DeviceObject {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Apple","McBook",1300,true,true,"13","IOS");
        System.out.println(laptop1.brand);
        System.out.println(laptop1.model);
        System.out.println(laptop1.price);
        System.out.println(laptop1.hasBattery);
        System.out.println(laptop1.hasMemory);
        System.out.println(laptop1.screenSize);
        System.out.println(laptop1.OS);

        laptop1.coding("java");
        System.out.println("Laptop: "+laptop1);

        Phone phone1 = new Phone("Apple","Iphone7",420,true,true,"5",true,"IOS");
        System.out.println(phone1.brand);
        System.out.println(phone1.model);
        System.out.println(phone1.price);
        System.out.println(phone1.hasBattery);
        System.out.println(phone1.hasMemory);
        System.out.println(phone1.hasSimCard);
        System.out.println(phone1.screenSize);
        System.out.println(phone1.OS);

        phone1.call(876998765);
        phone1.text(765889823);
        System.out.println("Phone: "+ phone1);

        TV tv1 = new TV("Samsung","4K QLED",2632,false,true,"40",true);
        System.out.println(tv1.brand);
        System.out.println(tv1.model);
        System.out.println(tv1.price);
        System.out.println(tv1.hasBattery);
        System.out.println(tv1.hasMemory);
        System.out.println(tv1.hasRemoteControl);
        System.out.println(tv1.screenSize);

        tv1.watch();
        System.out.println("TV: "+tv1);

    }
}
