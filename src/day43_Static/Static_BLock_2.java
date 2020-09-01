package day43_Static;

import day42_Static.Tester;

public class Static_BLock_2 {

    // main purpose is initializing the static variable

    static  int a;
    static  String b;
    static Tester tester1;
    static Tester tester2;

    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Sevda",'F',56432900,"SDET",120000.20);

        tester2 = new Tester();
        tester2.setInfo("Kevser",'F',8756543,"SDET",135000.20);

    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(tester1);
        System.out.println(tester2);

    }

}
