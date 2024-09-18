import java.util.Scanner;

class Box {
    float length, breadth;
    String color;

    public void setValues(float l, float b, String c) {
        length = l;
        breadth = b;
        color = c;
    }

    public void getValues() {
        System.out.println("Length of the box = " + length);
        System.out.println("Breadth of the box = " + breadth);
        System.out.println("Color of the box = " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Box mybox = new Box();
        
        System.out.print("Enter length of the box = ");
        float length = scan.nextFloat();
        
        System.out.print("Enter breadth of the box = ");
        float breadth = scan.nextFloat();

        scan.nextLine(); 
        
        System.out.print("Enter color of the box = ");
        String color = scan.nextLine();
        
        mybox.setValues(length, breadth, color);
        mybox.getValues();
        
        scan.close();
    }
}
