import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input an integer: ");
            int n = scan.nextInt();
            try {
                int x = 100 / n;
                System.out.println("100 / " + n + " = " + x);
            } catch (Exception e) {
                System.out.println("Invalid");
            }finally{
                System.out.println("try...catch is finished.");
            }
        }
    }
