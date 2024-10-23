/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class
Shape with three abstract methods namely calculateRectangleArea taking two
parameters, calculateSquareArea and calculateCircleArea taking one parameter each.
The parameters of calculateRectangleArea are its length and breadth, that of
calculateSquareArea is its side and that of calculateCircleArea is its radius. Now create
a sub-class Area; containing all the three methods calculateRectangleArea,
&#39;calculateSquareArea; and calculateCircleArea for printing the area of rectangle, square
and circle respectively. Create reference variable of this abstract class and calculate the
area of the circle, rectangle and square.*/

abstract class Shape{
    abstract double calculateRectangleArea(double length, double breadth);
    abstract double calculateSquareArea(double side);
    abstract double calculateCircleArea(double radius);
}
class Area extends Shape{
    @Override
    public double calculateRectangleArea(double length, double breadth){
        return length * breadth;
    }
    @Override
    public double calculateSquareArea(double side){
        return 4 * side;
    }
    @Override
    public double calculateCircleArea(double radius){
        return Math.PI * radius * radius;
    }
}
public class Main{
    public static void main(String[] args) {
        Shape shape = new Area();
        double rectangleArea = shape.calculateRectangleArea(5.0, 3.0);
        double squareArea = shape.calculateSquareArea(4.0);
        double circleArea = shape.calculateCircleArea(7.0);

        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}
