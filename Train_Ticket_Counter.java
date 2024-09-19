import java.util.Scanner;

public class TicketCounter {
    private int totalPassengers;
    private double totalMoney;
  
    public TicketCounter() {
        this.totalPassengers = 0;
        this.totalMoney = 0.0;
    }
    public void payingPassenger() {
        totalPassengers++;
        totalMoney += 50.0;
    }
    public void childPassenger() {
        totalPassengers++;
    }
    public void display() {
        System.out.println("Total Passengers: " + totalPassengers);
        System.out.println("Total Money Collected: Rs. " + totalMoney);
    }
++
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketCounter counter = new TicketCounter();

        while (true) {
            System.out.println("Press 'P' for a paying passenger");
            System.out.println("Press 'C' for a child passenger");
            System.out.println("Press 'D' to display totals and exit");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'P':
                case 'p':
                    counter.payingPassenger();
                    break;
                case 'C':
                case 'c':
                    counter.childPassenger();
                    break;
                case 'D':
                case 'd':
                    counter.display();
                    scanner.close();
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
