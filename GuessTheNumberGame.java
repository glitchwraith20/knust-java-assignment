import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(100) + 1; // random number from 1 to 100
        Scanner scanner = new Scanner(System.in);

        System.out.println("I have selected a number between 1 and 100.");
        System.out.println("Try to guess what it is.");

        int guessCount = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer guess: ");
                scanner.next();
            }
            int guess = scanner.nextInt();
            guessCount++;

            if (guess > target) {
                System.out.println("Too high, try again.");
            } else if (guess < target) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Correct! You guessed the number.");
                System.out.println("Number of guesses: " + guessCount);
                break;
            }
        }

        scanner.close();
    }
}
