import java.util.Scanner;

public class CinemaTicketBooking {
    public static void main(String[] args) {

        Scanner response = new Scanner(System.in);
        
        final double REGULAR_PRICE = 25.00, STUDENT_PRICE = 15.00, VIP_PRICE = 50.00;
        int totalTickets = 0;
        double totalCost = 0.0;
        int choice;

        do { 
            System.out.println("\n=== Cinema Ticket Booking ===");    
            System.out.println("1. Regular Ticket - GHS25.00");
            System.out.println("2. Student Ticket - GHS15.00");
            System.out.println("3. VIP Ticket - GHS50.00");
            System.out.println("4. Finish Booking");
            System.out.print("Select option: ");
            choice = response.nextInt();

            if (choice == 1) {
                totalTickets = totalTickets + 1;
                totalCost += REGULAR_PRICE;
                System.out.println("Regular ticket added.");
            }
            else if (choice == 2) {
                totalTickets = totalTickets + 1;
                totalCost += STUDENT_PRICE;
                System.out.println("Student ticket added.");
            }
            else if (choice == 3) {
                totalTickets = totalTickets + 1;
                totalCost += VIP_PRICE;
                System.out.println("VIP ticket added.");
            }
            else if (choice == 4) {
                System.out.println("Proceeding to checkout...");
            }
            else {
                System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);

        System.out.println("\n=== Booking Summary ===");
        if (totalTickets == 0) {
            System.out.println("No tickets booked.");
            System.out.printf("Total Tickets: %d\n", totalTickets);
            System.out.printf("Total Cost: GHS%.2f\n", totalCost);
        }
        else if (totalTickets >= 1 && totalTickets <= 3) {
            System.out.println("Booking Type: Standard booking");
            System.out.printf("Total Tickets: %d\n", totalTickets);
            System.out.printf("Total Cost: GHS%.2f\n", totalCost);
        }
        else {
            System.out.println("Booking Type: Group booking");
            System.out.printf("Total Tickets: %d\n", totalTickets);
            System.out.printf("Total Cost: GHS%.2f\n", totalCost);
        }

        response.close();
    }
}