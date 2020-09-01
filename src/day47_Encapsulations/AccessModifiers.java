package day47_Encapsulations;

public class AccessModifiers {
    // public = accessible at everywhere
    public static int publicVariable = 100;

    public static void publicMethod() {
        System.out.println("public method");
    }

    // default = visible within the same package only
    // there is no keyword in default access modifier
    static int defaultVariable = 200;

    static void defaultMethod() {
        System.out.println("default method");
    }

    // private = it is visible only within the same class
    private static int privateVariable = 300;

    private static void privateMethod() {
        System.out.println("private method");

    }

    public static void main(String[] args) {
        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);

        publicMethod();
        defaultMethod();
        privateMethod();

    }



}