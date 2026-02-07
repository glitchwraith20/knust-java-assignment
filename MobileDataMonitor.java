import java.util.Scanner;

public class MobileDataMonitor {
    public static void main(String[] args) {
        
        Scanner data = new Scanner(System.in);

        double dataBalance = 20.0, totalDataUsed = 0.0, sessionUsage;  

        while (dataBalance > 0) {
            System.out.print("Enter data used in this session (GB): ");
            sessionUsage = data.nextDouble();

            if (sessionUsage < 0) {
                System.out.printf("Error: Data usage cannot be negative. Please try again.\n");
                continue;
            }

            dataBalance = dataBalance - sessionUsage;
            totalDataUsed = totalDataUsed + sessionUsage;

            if (dataBalance > 5) {
                System.out.println("Data balance is sufficient.");
            }
            else if (dataBalance >= 1 && dataBalance <= 5) {
                System.out.println("Warning: Data balance is low.");
            }
            else if (dataBalance > 0 && dataBalance < 1) {
                System.out.println("Critical: Data almost exhausted.");
            }
            else {
                System.out.println("Data exhausted. Internet disconnected.");
            }
            System.out.printf("Current Balance: %.2f GB\n", dataBalance);
        }

        System.out.println("\n=== Final Summary ===");
        System.out.printf("Total Data Used: %.2f GB\n", totalDataUsed);
        System.out.printf("Final Balance: %.2f GB\n", dataBalance);

        data.close();
    }
}