import java.util.Scanner;

public class PopulationPrediction {
    public static void main(String[] args) {
        Scanner populate = new Scanner(System.in);

        int startingSize;
        do {
            System.out.print("Enter the starting number of organisms: ");
            while (!populate.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer >= 2: ");
                populate.next();
            }
            startingSize = populate.nextInt();
            if (startingSize < 2) {
                System.out.println("Starting population must be at least 2.");
            }
        } while (startingSize < 2);

        double dailyIncrease;
        do {
            System.out.print("Enter the average daily population increase (percentage): ");
            while (!populate.hasNextDouble()) {
                System.out.print("Invalid input. Enter a non-negative number: ");
                populate.next();
            }
            dailyIncrease = populate.nextDouble();
            if (dailyIncrease < 0) {
                System.out.println("Daily increase cannot be negative.");
            }
        } while (dailyIncrease < 0);

        int days;
        do {
            System.out.print("Enter the number of days the organisms will multiply: ");
            while (!populate.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer >= 1: ");
                populate.next();
            }
            days = populate.nextInt();
            if (days < 1) {
                System.out.println("Number of days must be at least 1.");
            }
        } while (days < 1);

        populate.close();

        double population = startingSize;
        double growthRate = dailyIncrease / 100.0;

        System.out.println("\nDay 1: " + (int) Math.round(population));
        for (int day = 2; day <= days; day++) {
            population += population * growthRate;
            System.out.printf("Day %d: %.2f%n", day, population);
        }
    }
}
