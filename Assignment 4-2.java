/*Suppose you are asked to model a toy-train ride at an amusement park. Passengers are expected
to pay Rs. 50 for a ticket. Children do not need a ticket. The ticket counter keeps track of the
number of passengers that have gone by, and of the total amount of money collected.
a) Model this ticket-counter with a class called ticket-counter. Use a type unsigned int to
hold the total number of passengers, and a type double to hold the total amount of money
collected.
b) Use a constructor to initialize both of these to 0.
c) Add the following member functions:
i. payingPassenger() that increments the passenger total by 1 and adds Rs. 50 to the
cash total.
ii. childPassenger() that increments the passenger total, but does not add anything to
the cash total.
iii. A member function called display() that display the two totals.
d) Include a program to test this class. The program should allow a ticket-collector to press
one key to count a paying passenger, another key to count a child passenger. By the
pushing a third key the collector can print the total number of passengers, total amount of
cash collected and then exit.*/
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
