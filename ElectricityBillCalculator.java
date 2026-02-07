import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);

        final double COST_PER_KWH = 0.20;
        int noOfAppliances;
        double consumption;
        double baseCost;
        double finalCost;
        double totalConsumption = 0;
        double totalCost = 0;

        System.out.print("Enter the total number of appliances: ");
        noOfAppliances = user.nextInt();

        for (int i = 1; i <= noOfAppliances; i++) {
            System.out.print("Enter the consumption (kWh) for appliance " + i + ": ");
            consumption = user.nextDouble();

            baseCost = consumption * COST_PER_KWH;

            if (consumption > 100) {
                finalCost = baseCost + (baseCost * 0.15);
                System.out.printf("Appliance %d: %.2f kWh, Cost: $%.2f (Surcharge Applied)\n", i, consumption, finalCost);
            }
            else {
                finalCost = baseCost;
                System.out.printf("Appliance %d: %.2f kWh, Cost: $%.2f\n", i, consumption, finalCost);
            }

            totalConsumption += consumption;
            totalCost += finalCost;
        }

        System.out.printf("Total Consumption: %.2f kWh\n", totalConsumption);
        System.out.printf("Total Cost: $%.2f\n", totalCost);

        user.close();
    }
}