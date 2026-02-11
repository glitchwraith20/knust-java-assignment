import java.util.Scanner;
public class SecurityLockout {
    public static void main(String[] args) {

        Scanner security = new Scanner(System.in);

        double cardBalance = 15.00;
        final double RIDE_COST = 2.50;
        int failedAttempts = 0, userChoice;

        while (cardBalance >= RIDE_COST && failedAttempts < 3) {
            System.out.println("Do you want to take a ride? (Enter 1 for Yes, 2 for No: ");
            userChoice = security.nextInt();

            if (userChoice == 1) {
                cardBalance -= RIDE_COST;
                System.out.printf("Ride successful. Remaining balance: %.2f\n", cardBalance);
            }
            else {
                failedAttempts++;
                System.out.printf("No ride taken. Warning: %d/3 inactivity marks.\n", failedAttempts);
            }
        }

        System.out.printf("Final Balance: %.2f\n", cardBalance);
        
        if (cardBalance < RIDE_COST) {
            System.out.println("Insufficient funds for another ride.");
        }
        else if (failedAttempts == 3) {
            System.out.println("Session timed out due to inactivity.");
        }

        security.close();
    }
}
