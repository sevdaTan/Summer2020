package Library;

import day47_Encapsulations.AccessModifiers;

public class Test_AccessModifiers {

    public static void main(String[] args) {
// public is visible at everywhere
        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        // we cannot access the default outside the package
//        System.out.println(AccessModifiers.defaultVariable);
//        AccessModifiers.defaultMethod();
//  'defaultMethod()' is not public in
//   'day47_Encapsulations.AccessModifiers'.
//   Cannot be accessed from outside package


        // We can call the private only inside of the class
//        System.out.println(AccessModifiers.privateVariable);
//        AccessModifiers.privateMethod();





    }

}
