import java.util.Scanner;

public class KioskSystem {
    public static void main(String[] args) {

        Scanner kiosk = new Scanner(System.in);

        final double BURGER_PRICE = 5.99, FRIES_PRICE = 2.50;
        double grandTotal = 0.0;
        int totalItems = 0, choice, quantity;

        do { 
            System.out.println("\n=== Fast Food Kiosk ===");
            System.out.println("1. Burger - $5.99");
            System.out.println("2. Fries - $2.50");
            System.out.println("3. Checkout");
            
            System.out.print("Select option: ");
            choice = kiosk.nextInt();

            if (choice == 1) {
                System.out.print("Enter quantity: ");
                quantity = kiosk.nextInt();

                if (quantity < 0) {
                    System.out.println("Error: Quantity cannot be negative.");
                }
                else {
                    grandTotal += (quantity * BURGER_PRICE);
                    totalItems += quantity;
                    System.out.printf("Added %d Burgers to cart\n", quantity);
                }
            }
            else if (choice == 2) {
                System.out.print("Enter quantity: ");
                quantity = kiosk.nextInt();

                if (quantity < 0) {
                    System.out.println("Error: Quantity cannot be negative.");
                }
                else {
                    grandTotal += (quantity * FRIES_PRICE);
                    totalItems += quantity;
                    System.out.printf("Added %d Fries to cart\n", quantity);
                }
            }
            else if (choice == 3) {
                System.out.println("Proceeding to checkout...");
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }

        } while (choice != 3);

        System.out.println("\n=== Checkout Summary ===");
        System.out.printf("Total Items: %d\n", totalItems);
        System.out.printf("Grand Total: $%.2f\n", grandTotal);

        kiosk.close();
    }
}