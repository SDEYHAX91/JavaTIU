/*Create a class Calculator with methods to add, subtract, multiply, and divide
numbers. Implement method overloading to handle different data types (int,
double, float) for each operation.*/
class Calculator{
    public int add(int x,int y){
        return x + y;
    }
    public double add(double x,double y){
        return x + y;
    }
    public int subtract(int x,int y){
        return x - y;
    }
    public double  subtract(double  x,double  y){
        return x - y;
    }
    public int product(int x,int y){
        return x * y;
    }
    public double product(double x,double y){
        return x + y;
    }
    public int division(int x,int y){
        return x / y;
    }
    public double division(double x,double y){
        return x / y;
    }
}
public class Main{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 4));
        System.out.println(calc.add(6.32, 8.45));
        System.out.println(calc.subtract(9, 7));
        System.out.println(calc.subtract(56.89, 42.87));
        System.out.println(calc.product(7, 45));
        System.out.println(calc.product(104.27, 65.234));
        System.out.println(calc.division(10, 2));
        System.out.println(calc.division(134.567, 8.792));
    }
}
