import java.util.Scanner;

class Rectangle{
    float length,breadth;
    
    public void setDimensions(float l, float b){
        length = l;
        breadth = b;
    }

    public void getDimensions(){
        System.out.println("Given length: " + length);
        System.out.println("Given breadth: " + breadth);
    }

    public float area(){
        return length * breadth;
    }

    public float perimeter(){
        return 2*(length + breadth);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of rectangle = ");
        float length = scan.nextFloat();
        System.out.print("Enter breadth of rectangle = ");
        float breadth = scan.nextFloat();
        Rectangle rect1 = new Rectangle();
        rect1.setDimensions(length, breadth);
        rect1.getDimensions();
        System.out.println("Area of the rectangele = " + rect1.area());
        System.out.println("Perimeter of the rectangle = " + rect1.perimeter());
    }
}
