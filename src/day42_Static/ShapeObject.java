package day42_Static;

import com.sun.javaws.IconUtil;

public class ShapeObject {

    public static void main(String[] args) {

    Circle c1 = new Circle();
    c1.setInfo(25);

        System.out.println(c1.calcArea());
        System.out.println(c1.calcPerimeter());

        System.out.println(c1);

        System.out.println("========");

        Circle c2 = new Circle();
        System.out.println(c2);

        System.out.println("==========");

        Circle c3 = new Circle();
        System.out.println(c3);


    }
}
