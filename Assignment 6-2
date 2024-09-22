/*Design a class Shape with a method calculateArea(). Implement method
overloading to calculate areas of different shapes (circle, rectangle, square) based
on their specific parameters.*/

class Shape{
    public double calculateArea(double length, double breadth){
        return length * breadth;
    }
    public double calculateArea(int side){
        return side * side;
    }
    public double calculateArea(double radius){
        return Math.PI * radius *radius;
    }
    public static void main(String[] args) {
        Shape shape = new Shape();
        double RectArea = shape.calculateArea(45,36);
        double SqArea = shape.calculateArea(34);
        double CircleArea = shape.calculateArea(7.62);
        System.out.println("Area of the Rectangle = " + RectArea); 
        System.out.println("Area of the Square = " + SqArea);
        System.out.println("Area of the Circle = " + CircleArea);
    }
}
