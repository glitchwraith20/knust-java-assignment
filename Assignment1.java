

public class Assignment1 {
    public static void main(String[] args) {
        // A PROGRAM TO CALCULATE THE AVERAGE OF THE FIRST TEN INTEGERS, ITS STANDARD DEVIATION AND FACTORIAL OF SD

        // Declaring the varaibles
        int n = 10;
        int sum = 0;

        // Calculate the sum of the first ten integers
        for (int i = 1; i <= n; i++) {
            sum += i;   
        }

        // Calculate average
        double average = (double) sum / n;
        System.out.printf("Average: %.2f\n", average);

        // Calculate standard deviation
        double sumSquareDiff = 0;

        for (int i = 1; i <= n; i++) {
            sumSquareDiff += Math.pow(i - average, 2);
        }
        double standardDeviation = Math.sqrt(sumSquareDiff / n);
        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);

        // Calculate factorial of SD (round to nearest int)
        int sdInt = (int) Math.round(standardDeviation);
        long factorial = 1;
        for (int i =1; i <= sdInt; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of SD: " + factorial);

    }
}
