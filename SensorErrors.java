public class SensorErrors {
    public static void main(String[] args) {
        
        final double temperatures[] = {2.5,3.0,15.0,4.2,-1.0,22.0,3.8,5.0};
        double sum = 0, average;
        int validSensorCount = 0, i;

        for (i = 0; i < temperatures.length; i++) {
            if (temperatures[i] <= 10.0) {
                sum += temperatures[i];
                validSensorCount++;
            }
            else {
                System.out.printf("Sensor %d: %.2f°C - ERROR: Reading Ignored\n", i, temperatures[i]);
            }
        }

        if (validSensorCount > 0) {
            average = sum / validSensorCount;
            System.out.printf("Total Valid Sensors Found: %d\n", validSensorCount);
            System.out.printf("Final Average Temperature: %.2f°Cs\n", average);
        }
        else {
            System.out.printf("No valid sensor readings found.\n");
        }

    }
}
