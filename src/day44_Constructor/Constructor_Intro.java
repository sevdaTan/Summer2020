package day44_Constructor;

public class Constructor_Intro {
// watch this recording
    public Constructor_Intro(String arr){
     // The constructor is used for

        System.out.println("Hello "+ arr);
        System.out.println("How are you " + arr);
    }

    public static void main(String[] args) {


       // Constructor_Intro obj1 = new Constructor_Intro(10);

        // Constructor_Intro obj2 = new Constructor_Intro();

        Constructor_Intro obj3 = new Constructor_Intro("Sevda");
        Constructor_Intro obj4 = new Constructor_Intro("Jika");
        Constructor_Intro obj5 = new Constructor_Intro("Hatice");



    }

}
