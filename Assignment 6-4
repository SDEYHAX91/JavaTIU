/*Create a Shape base class with a method calculateArea(). Derive classes
Circle, Rectangle, and Square from Shape. Override the calculateArea()
method in each derived class to calculate the area specific to the shape.*/
class Shape{
    public double calculateArea(double a){
        return 0.0;       
    }
    public double calculateArea(double x, double y){
        return 0.0;
    }
}
class Rectangle extends Shape{
    @Override
    public double calculateArea(double length, double breadth){
        return length * breadth;
    }    
}
class Square extends Shape{
    @Override
    public double calculateArea(double side){
        return side * side;
    }    
}
class Circle extends Shape{
    @Override
    public double calculateArea(double radius){
        return Math.PI * radius * radius;
    }    
}
public class Main{
    public static void main(String[] args) {
        Shape rect = new Rectangle();
        Shape sq = new Square();
        Shape circ = new Circle();

        System.out.println("Area of the rectangle = " + rect.calculateArea(110.80,92));
        System.out.println("Area of the Square = " + sq.calculateArea(67.65));
        System.out.println("Area of the Circle = " + circ.calculateArea(5.56));
    }
}
