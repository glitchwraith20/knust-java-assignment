import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();

        int computerWins = 0, userWins = 0;

        System.out.println("Dice game: computer vs user");

        for (int round = 1; round <= 10; round++) {
            int computerRoll = random.nextInt(6) + 1;
            int userRoll = random.nextInt(6) + 1;

            System.out.printf("Round %d: computer rolled %d, user rolled %d.%n", round, computerRoll, userRoll);

            if (computerRoll > userRoll) {
                computerWins++;
                System.out.println("  Computer wins this round.");
            } else if (userRoll > computerRoll) {
                userWins++;
                System.out.println("  User wins this round.");
            } else {
                System.out.println("  Tie. No winner this round.");
            }
        }

        System.out.println();
        System.out.println("Computer wins: " + computerWins);
        System.out.printf("User wins: %d\n", userWins);

        if (computerWins > userWins) {
            System.out.println("Grand winner: Computer");
        } else if (userWins > computerWins) {
            System.out.println("Grand winner: User");
        } else {
            System.out.println("The game is a tie. No grand winner.");
        }
    }
}
