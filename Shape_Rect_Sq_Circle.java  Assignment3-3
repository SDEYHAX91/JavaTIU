/*Create a shape class with two method calculate_area() and calculate_perimeter(). Create three
subclasses Rectangle, Square and Circle that will be override the calculate_area() and
calculate_perimeter() method. Create a Test class with a main() method that creates the objects of
all these classes and invoke respective methods.*/

abstract class Shape{
    abstract double area();
    abstract double perimeter();
}
class Rectangle extends Shape{
    double length,breadth;

    public Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
    @Override
    public double area(){
        return length * breadth;
    }
    @Override
    public double perimeter(){
        return 2*(length + breadth); 
    }
}
class Square extends Shape{
    double side;
    public Square(double s){
        side = s;
    }
    @Override
    public double area(){
        return side * side;
    }
    @Override
    public double perimeter(){
        return 4 * side;
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double r){
        radius = r;
    }
    @Override
    public double area(){
        return Math.PI * radius * radius;
    }
    @Override
    public double perimeter(){
        return 2 * Math.PI * radius; 
    }
}
public class Test{
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 15);
        Square sq = new Square(30);
        Circle C = new Circle(35);
        System.out.println("Rectangle:");
        System.out.println("Area: " + rect.area());
        System.out.println("Perimeter: " + rect.perimeter());

        // Display area and perimeter for Square
        System.out.println("\nSquare:");
        System.out.println("Area: " + sq.area());
        System.out.println("Perimeter: " + sq.perimeter());

        // Display area and perimeter for Circle
        System.out.println("\nCircle:");
        System.out.println("Area: " + C.area());
        System.out.println("Perimeter: " + C.perimeter());
    }
}
        
