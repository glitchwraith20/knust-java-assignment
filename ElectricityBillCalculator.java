import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);

        int noOfAppliance;
        double costPerKWH = 0.20;
        double totalConsumption;
        double totalCost;
        double finalCost;

        System.out.print("Enter the no. of appliances (n): ");
        noOfAppliance = user.nextInt();

        for (int i = 1; i <= noOfAppliance; i++) {
            
        }

        user.close();
    }
}