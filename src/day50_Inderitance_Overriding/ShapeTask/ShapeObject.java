package day50_Inderitance_Overriding.ShapeTask;

public class ShapeObject {
    public static void main(String[] args) {
        System.out.println("==== Circle =====");
    Circle circle = new Circle(3);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());

        System.out.println("==== Rectangle =====");
    Rectangle rectangle = new Rectangle(4,9);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        System.out.println("==== Square =====");
    Square square = new Square(8);
        System.out.println(square.calculateArea());
        System.out.println(square.calculatePerimeter());
    }
}
