package Office_Hours.Practice_09_02_2020;

public class Circle {
    public double radius;
    public double diameter;
    public static double PI ;
    public double area;
    public double perimeter;

    static { // only runs one time, first to run
        PI = 3.14;
    }

    public Circle(double radius){
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
// for internal use only
    private double calculateArea(){
        return (radius * radius) * PI;
    }

    private double calculatePerimeter(){
        return  diameter * PI;
    }



}
