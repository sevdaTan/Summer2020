package day50_Inderitance_Overriding.ShapeTask;

public class Square extends Shape{

    public double length;


    public Square(double length) {
        this.length = length;


    }


    public double calculateArea() {
        return length * length;
    }

    public double calculatePerimeter() {
        return (length * 4);
    }
}