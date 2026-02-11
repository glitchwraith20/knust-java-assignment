import java.util.Scanner;

public class Unstable {
    public static void main(String[] args) {

        Scanner unstable = new Scanner(System.in);

        int noOfExperiments, i;
        double morningTemp, eveningTemp, averageTemp, grandTotal = 0, finalAverage;

        System.out.print("Enter the total number of experiments: ");
        noOfExperiments = unstable.nextInt();
        System.out.println("=======================================\n");

        for (i = 1; i <= noOfExperiments; i++) {
            System.out.print("Enter morning temperature: ");
            morningTemp = unstable.nextDouble();

            System.out.print("Enter evening temperature: ");
            eveningTemp = unstable.nextDouble();

            averageTemp = (morningTemp + eveningTemp) / 2;
            grandTotal += averageTemp;
        
            if (averageTemp > 100) {
                System.out.printf("Experiment %d: %.2f°C STATUS: UNSTABLE\n", i, averageTemp);
            }
            else {
                System.out.printf("Experiment %d: %.2f°C STATUS: NORMAL\n", i, averageTemp);
            }
        }

        if (noOfExperiments > 0) {
            finalAverage = grandTotal / noOfExperiments;
            System.out.println("\n=======================================");
            System.out.printf("Final Grand Average: %.2f°C\n", finalAverage);
        }
        else {
            System.out.println("No experiments were conducted.");
        }

        unstable.close();
    }
}
