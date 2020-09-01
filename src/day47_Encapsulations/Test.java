package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {

        // public is accessible in everywhere
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        // default is accessible only in the same package
        System.out.println(AccessModifiers.defaultVariable);
        AccessModifiers.defaultMethod();

        // private is accessible only in the same class
//        System.out.println(AccessModifiers.privateVariable);
//        AccessModifiers.privateMethod();
        // privateMethod()' has private access in
        // 'day47_Encapsulations.AccessModifiers


        encapsulation obj1 = new encapsulation();
       // System.out.println(obj1.ssn); //gives compiler error

        System.out.println(obj1.getSSN());

        obj1.setSsn(8766785); // new ssn 8766785
        System.out.println(obj1.getSSN());
    }

}
