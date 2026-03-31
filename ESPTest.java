import java.util.Random;
import java.util.Scanner;

public class ESPTest {
    public static void main(String[] args) {
        String[] colors = {"Red", "Green", "Blue", "Orange", "Yellow"};
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctGuesses = 0;
        System.out.println("ESP Test: Try to guess the randomly selected color.");

        int trail = 1;
        for (int trial = 1; trial <= 10; trial++) {
            int index = random.nextInt(colors.length);
            String selectedColor = colors[index];

            System.out.print("Guess the color (Red, Green, Blue, Orange, Yellow): ");
            String guess = scanner.nextLine().trim();

            System.out.println("Selected color: " + selectedColor);
            if (guess.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }
            System.out.printf("Trail %d complete.\n", trail);
        }

        scanner.close();

        System.out.printf("You guessed correctly %d out of 10 times.", correctGuesses);
    }
}
