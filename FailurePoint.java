import java.util.Scanner;

public class FailurePoint {
    public static void main(String[] args) {

        Scanner pForce = new Scanner(System.in);

        double sIntegrity = 100.0;
        int cycleCount = 0;
        final double fThreshold = 15.0;
        double pressureForce;

        while (sIntegrity > fThreshold) {
            cycleCount++;
            
            System.out.printf("Enter pressure force for Cycle %d: ", cycleCount);
            pressureForce = pForce.nextDouble();

            sIntegrity -= pressureForce;

            if (pressureForce > 20.0) {
                sIntegrity = sIntegrity - 5;
            }

            System.out.printf("Remaining Integrity: %.2f\n", sIntegrity);
        }

        System.out.printf("Material Failure at Cycle %d!\n", cycleCount);
        System.out.printf("Final Integrity Level: %.2f\n", sIntegrity);

        pForce.close();
    }
}
