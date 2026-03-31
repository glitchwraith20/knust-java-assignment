import java.util.Scanner;

public class RainfallCalculator {
    public static void main(String[] args) {
        Scanner rain = new Scanner(System.in);

        int years;
        do {
            System.out.print("Enter the number of years: ");
            while (!rain.hasNextInt()) {
                System.out.print("Invalid input. Enter a positive integer for years: ");
                rain.next();
            }
            years = rain.nextInt();
            if (years < 1) {
                System.out.println("Number of years must be at least 1.");
            }
        } while (years < 1);

        double totalRainfall = 0.0;
        int totalMonths = years * 12;

        for (int year = 1; year <= years; year++) {
            System.out.println("Year " + year + ":");
            for (int month = 1; month <= 12; month++) {
                double rainfall;
                do {
                    System.out.printf("  Enter rainfall for month %d (in inches): ", month);
                    while (!rain.hasNextDouble()) {
                        System.out.print("  Invalid input. Enter a non-negative number: ");
                        rain.next();
                    }
                    rainfall = rain.nextDouble();
                    if (rainfall < 0) {
                        System.out.println("  Rainfall cannot be negative.");
                    }
                } while (rainfall < 0);
                totalRainfall += rainfall;
            }
        }

        rain.close();

        double averageRainfall = totalRainfall / totalMonths;

        System.out.println();
        System.out.println("Number of months: " + totalMonths);
        System.out.printf("Total inches of rainfall: %.2f%n", totalRainfall);
        System.out.printf("Average rainfall per month: %.2f inches%n", averageRainfall);
    }
}
