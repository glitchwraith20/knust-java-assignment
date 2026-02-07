

public class FuelConsumptionAnalysis {
    public static void main(String[] args) {
        
        final double fuelConsumption[] = {12.5, 22.0, 8.4, 18.6, 25.3, 9.8, 15.0};
        double totalFuel = 0, averageFuel;
        int highCount = 0, normalCount = 0, lowCount = 0;
        double peakConsumption = 0;
        int peakDay = 0, index = 0;

        System.out.println("=== Daily Fuel Consumption Report ===");

        do {
            if (fuelConsumption[index] > 20) {
                System.out.printf("Day %d: %.2f litres - High\n", (index+1), fuelConsumption[index]);
                highCount = highCount + 1;
            }
            else if (fuelConsumption[index] >= 10 && fuelConsumption[index] <= 20) {
                System.out.printf("Day %d: %.2f litres - Normal\n", (index+1), fuelConsumption[index]);
                normalCount = normalCount + 1;
            }
            else {
                System.out.printf("Day %d: %.2f litres - Low\n", (index+1), fuelConsumption[index]);
                lowCount = lowCount + 1;
            }

            totalFuel += fuelConsumption[index];

            if (fuelConsumption[index] > peakConsumption) {
                peakConsumption = fuelConsumption[index];
                peakDay = index + 1;
            }

            index = index + 1;
        } while (index < fuelConsumption.length);

        averageFuel = totalFuel / fuelConsumption.length;
        System.out.print("\n=== Weekly Summary ===\n");
        System.out.printf("Total Fuel Consumption: %.2f litres\n", totalFuel);
        System.out.printf("Average Daily Consumption: %.2f litres\n", averageFuel);
        System.out.printf("High Usage Days: \n", highCount);
        System.out.printf("Normal Usage Days: \n", normalCount);
        System.out.printf("Low Usage Days: \n", lowCount);
        System.out.printf("Peak Consumption: Day %d with %.2f litres\n", peakDay, peakConsumption);

    }
}