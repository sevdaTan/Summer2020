package Library;

import day50_Inderitance_Overriding.Access_Modifiers;
import day50_Inderitance_Overriding.Test;

public class Inheritance_Test extends Access_Modifiers {

    public static void main(String[] args) {

        System.out.println(Inheritance_Test.publicData);// public is visible outside package always
        System.out.println(Inheritance_Test.protectedData);// protected is visible always with the extend keyword(if it is a subclass)
      //  System.out.println(Inheritance_Test.defaultData); //default is nat visible outside of the package

    }



}
