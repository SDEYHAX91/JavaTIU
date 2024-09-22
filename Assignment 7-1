/*Create an abstract Shape class with the following attributes:
● color (String)
● area (double)
Implement abstract methods:
● calculateArea()
Create concrete subclasses Circle and Rectangle that inherit from Shape and implement the
calculateArea() method accordingly.*/
abstract class Shape {
    protected String color;
    protected double area;

    public Shape(String color) {
        this.color = color;
    }
    public abstract void calculateArea();

    public double getArea() {
        return area;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        calculateArea();
    }
    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
        calculateArea();
    }
    @Override
    public void calculateArea() {
        area = length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 6.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}

