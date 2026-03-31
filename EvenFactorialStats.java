import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EvenFactorialStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> evenNumbers = new ArrayList<>();

        System.out.println("Enter 20 integers between 1 and 20 (inclusive).\n" +
                "The program will collect the even numbers from your inputs.");

        for (int i = 1; i <= 20; i++) {
            int value;
            do {
                System.out.print("Enter integer " + i + ": ");
                while (!scanner.hasNextInt()) {
                    System.out.print("Invalid input. Enter an integer between 1 and 20: ");
                    scanner.next();
                }
                value = scanner.nextInt();
                if (value < 1 || value > 20) {
                    System.out.println("Value must be between 1 and 20.");
                }
            } while (value < 1 || value > 20);

            if (value % 2 == 0) {
                evenNumbers.add(value);
            }
        }

        scanner.close();

        if (evenNumbers.isEmpty()) {
            System.out.println("No even numbers were entered.");
            return;
        }

        int[] evenArray = new int[evenNumbers.size()];
        for (int i = 0; i < evenNumbers.size(); i++) {
            evenArray[i] = evenNumbers.get(i);
        }

        double sum = 0;
        for (int value : evenArray) {
            sum += value;
        }

        double average = sum / evenArray.length;
        System.out.println("\nEven numbers entered: " + evenNumbers);
        System.out.println("Average of even numbers: " + average);

        long averageForFactorial = Math.round(average);
        if (average != averageForFactorial) {
            System.out.println("Average is not an integer, so the factorial will be computed for the rounded value: " + averageForFactorial);
        }

        if (averageForFactorial < 0) {
            System.out.println("Cannot compute factorial for a negative value.");
            return;
        }

        long factorialValue = factorial(averageForFactorial);
        System.out.println("Factorial of " + averageForFactorial + ": " + factorialValue);

        double sqrtFactorial = Math.sqrt(factorialValue);
        System.out.printf("Square root of the factorial result: %.6f%n", sqrtFactorial);

        double[] stats = {factorialValue, sqrtFactorial};
        double stdDev = standardDeviation(stats);
        System.out.printf("Standard deviation of factorial and its square root: %.6f%n", stdDev);
    }

    private static long factorial(long n) {
        long result = 1;
        for (long i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static double standardDeviation(double[] values) {
        int n = values.length;
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double mean = sum / n;
        double varianceSum = 0;
        for (double value : values) {
            varianceSum += Math.pow(value - mean, 2);
        }
        double variance = varianceSum / n;
        return Math.sqrt(variance);
    }
}