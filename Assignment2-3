/*Create classes such as Product, Cart and Order to simulate an online shopping system.
Implement methods to add products to a cart, calculate the total cost and process
payments.*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Cart {
    private List<Product> products;
    public Cart() {
        products = new ArrayList<>();
    }
    public void addProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " has been added to the cart.");
    }
    public double calculateTotalCost() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public void displayCart() {
        System.out.println("Cart contains:");
        for (Product product : products) {
            System.out.println("- " + product.getName() + ": $" + product.getPrice());
        }
    }
}

class Order {
    private Cart cart;
    private boolean isPaid;

    public Order(Cart cart) {
        this.cart = cart;
        this.isPaid = false;
    }
    public void processPayment() {
        double totalCost = cart.calculateTotalCost();
        if (totalCost > 0) {
            System.out.println("Processing payment of $" + totalCost);
            this.isPaid = true;
            System.out.println("Payment successful. Order placed.");
        } else {
            System.out.println("Cart is empty. Add products before proceeding with payment.");
        }
    }
    public boolean isPaid() {
        return isPaid;
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cart cart = new Cart();

        Product product1 = new Product("Laptop", 800.00);
        Product product2 = new Product("Phone", 500.00);
        Product product3 = new Product("Headphones", 50.00);

        System.out.println("Available products:");
        System.out.println("1. " + product1.getName() + " - $" + product1.getPrice());
        System.out.println("2. " + product2.getName() + " - $" + product2.getPrice());
        System.out.println("3. " + product3.getName() + " - $" + product3.getPrice());

        boolean shopping = true;
        while (shopping) {
            System.out.print("Enter the product number to add to the cart (or 0 to checkout): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    cart.addProduct(product1);
                    break;
                case 2:
                    cart.addProduct(product2);
                    break;
                case 3:
                    cart.addProduct(product3);
                    break;
                case 0:
                    shopping = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
        cart.displayCart();
        Order order = new Order(cart);
        order.processPayment();
        scanner.close();
    }
}
