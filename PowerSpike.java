import java.util.Scanner;

public class PowerSpike {
    public static void main(String[] args) {

        Scanner power = new Scanner(System.in);

        double boardHealth = 100.0;
        int spikeCount = 0, userChoice = 1;
        double damageValue;

        do { 
            spikeCount++;

            System.out.printf("Enter damage for spike %d: \n", spikeCount);
            damageValue = power.nextDouble();

            boardHealth -= damageValue;
            System.out.printf("Remaining Health: %.2f\n", boardHealth);

            if (boardHealth > 0) {
                System.out.print("Continue testing? (1 for Yes, 0 for No): ");
                userChoice = power.nextInt();
            }
            else {
                userChoice = 0;
            }

        } while (boardHealth > 0 && userChoice == 1);

        System.out.printf("Total spikes survived: %d\n", spikeCount);

        if (boardHealth <= 0) {
            System.out.println("TEST TERMINATED: Component Destroyed.");
        }

        power.close();
    }
}
