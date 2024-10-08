import java.util.Scanner;

interface Calculator{
    public int add(int a, int b);
    public int subtract(int a, int b);
}

class SimpleCalculator implements Calculator{
    public int add(int a, int b){
        return a + b;
    }
    public int subtract(int a, int b){
        return a - b;
    }
}

public class Main{
    public static void main(String[] args) {
        Calculator calc = new SimpleCalculator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int x = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int y = scan.nextInt();
        System.out.println(x + " + " + y + " = " + calc.add(x, y));
        System.out.println(x + " - " + y + " = " + calc.subtract(x, y));
    }
}
