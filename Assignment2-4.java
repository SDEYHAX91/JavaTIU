/*Write a program that creates two classes one is Measurement and another is the main method
class. Measurement class contain km, meter, milimeter in decimal and a constructor and three
methods; first method will return the round off kilometer, the second method will return the round
off meter and third method will return the round off milimeter. Takes the values and display
them.*/

import java.util.Scanner;

class Measurement{
    double kilometre,metre,millimetre;

    public Measurement(double km, double m, double mm){
        kilometre = km;
        metre = m;
        millimetre = mm;
    }
    public long roundKm(){
        return Math.round(kilometre);
    }
    public long roundmetre(){
        return Math.round(metre);
    }
    public long roundMm(){
        return Math.round(millimetre);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter distance in Kilometre = ");
        double km = scan.nextDouble();
        System.out.print("Enter distance in Metre = ");
        double m = scan.nextDouble();
        System.out.print("Enter distance in Millimetre = ");
        double mm = scan.nextDouble();
        Measurement M = new Measurement(km, m, mm);

        System.out.println("Rounded Kilometre = " + M.roundKm());
        System.out.println("Rounded Metre = " + M.roundmetre());
        System.out.println("Rounded Millimetre = " + M.roundMm());
        scan.close();
    }
}
