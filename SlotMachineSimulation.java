import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] symbols = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};

        double totalEntered = 0.0, totalWon = 0.0;
        boolean playAgain = true;

        System.out.println("Welcome to the slot machine simulator.");

        while (playAgain) {
            double amount;
            do {
                System.out.print("Enter the amount of money to insert into the slot machine: ");
                while (!scanner.hasNextDouble()) {
                    System.out.print("Invalid input. Enter a positive number: ");
                    scanner.next();
                }
                amount = scanner.nextDouble();
                if (amount <= 0) {
                    System.out.println("Amount must be greater than 0.");
                }
            } while (amount <= 0);

            totalEntered += amount;

            String[] result = new String[3];
            for (int i = 0; i < result.length; i++) {
                result[i] = symbols[random.nextInt(symbols.length)];
            }

            System.out.printf("Spinning... %s  %s  %s%n", result[0], result[1], result[2]);

            int matches;
            if (result[0].equals(result[1]) && result[1].equals(result[2])) {
                matches = 3;
            } else if (result[0].equals(result[1]) || result[0].equals(result[2]) || result[1].equals(result[2])) {
                matches = 2;
            } else {
                matches = 0;
            }

            double payout;
            if (matches == 3) {
                payout = amount * 3;
                System.out.printf("Three of a kind! You win $%.2f.\n", payout);
            } else if (matches == 2) {
                payout = amount * 2;
                System.out.printf("Two matching symbols! You win $%.2f.\n", payout);
            } else {
                payout = 0.0;
                System.out.println("No matches. You won $0.00.");
            }

            totalWon += payout;

            scanner.nextLine();
            String response;
            do {
                System.out.print("Do you want to play again? (Y/N): ");
                response = scanner.nextLine().trim();
            } while (!response.equalsIgnoreCase("Y") && !response.equalsIgnoreCase("N")
                    && !response.equalsIgnoreCase("Yes") && !response.equalsIgnoreCase("No"));

            playAgain = response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("Yes");
        }

        System.out.printf("%nTotal amount entered: $%.2f%n", totalEntered);
        System.out.printf("Total amount won: $%.2f%n", totalWon);
        scanner.close();
    }
}
