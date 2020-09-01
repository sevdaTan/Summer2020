package day48_Inheritance.DeviceTask;
/*
3. create a sub class of device called phone:
                    attributes: brand, model, price, MadeIn, screenSize, hasBattery, hasMemory, hasSimCard, OS
                    methods: call, text, setInfo, toString
                    add a constructor that can set the fields
 */
public class Phone extends Device {
 /*
    Inherited :
    Variables = brand, model,price,madein,hasBattery,isElectronic,screenSize
    methods = setInfo, toString

     not inherited:
     variable =  hasSimCard, OperatingSystem(OS)
     method = call, text
     */

    public boolean hasSimCard = true;
    public String OS;

    public Phone(String brand, String model, double price, boolean hasBattery,
                 boolean hasMemory, String screenSize, boolean hasSimCard, String OS) {
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);

        this.hasSimCard = hasSimCard;
        this.OS = OS;
    }
    public void call(long phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(("Texting "+ phoneNumber));
    }

}
