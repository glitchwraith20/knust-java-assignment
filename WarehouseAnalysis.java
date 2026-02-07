

public class WarehouseAnalysis {
    public static void main(String[] args) {
        
        double weights[] = {12.5, 55.0, 45.0, 18.0, 22.5, 60.0, 30.0, 15.0, 50.0, 10.0};
        double totalWeight = 0, averageWeight;
        int heavyCount = 0, mediumCount = 0, lightCount = 0;
        double heaviestWeight = 0;
        int heaviestIndex = 0;

        System.out.println("=== Box Classification ===");

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > 50) {
                System.out.printf("Box %d: Heavy\n", i+1);
                heavyCount = heavyCount + 1;
            }
            else if (weights[i] >= 20 && weights[i] <= 50) {
                System.out.printf("Box %d: Medium\n", i+1);
                mediumCount = mediumCount + 1;
            }
            else {
                System.out.printf("Box %d: Light\n", i+1);
                lightCount = lightCount + 1;
            }

            totalWeight += weights[i];

            if (weights[i] > heaviestWeight) {
                heaviestWeight = weights[i];
                heaviestIndex = i + 1;
            }
        }

        averageWeight = totalWeight / weights.length;
        System.out.print("\n=== Summary ===\n");
        System.out.printf("Total Weight: %.2f kg\n", totalWeight);
        System.out.printf("Average Weight: %.2f kg\n", averageWeight);
        System.out.printf("Heavy Boxes: %d\n", heavyCount);
        System.out.printf("Medium Boxes: %d\n", mediumCount);
        System.out.printf("Light Boxes: %d\n", lightCount);
        System.out.printf("Heaviest Box: Box %d with %.2f kg\n", heaviestIndex, heaviestWeight);
        
    }
}