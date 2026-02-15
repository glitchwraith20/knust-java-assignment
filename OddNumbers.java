public class OddNumbers {
    public static void main(String[] args) {

        int count = 0, sum = 0, i;

        for (i = 0; i < 80; i++) {
            if (i % 2 == 1 &&  i != 1 && i != 3) {
                count++;
            }
        }

        int[] oddNUmbers = new int[count];
        int index = 0;

        for (i = 0; i < 80; i++) {
            if (i % 2 == 1 &&  i != 1 && i != 3) {
                oddNUmbers[index] = i;
                sum += i;
                index++;
            }
        }

        // Average
        double average = (double) sum / index;
        System.out.printf("Average: %.2f\n", average);
                
        // Standard Deviation
        double variance = 0;

        for (i = 0; i < index; i++) {
            variance += Math.pow(oddNUmbers[i] - average, 2);
        }

        double standardDeviation = Math.sqrt(variance / index);
        System.out.printf("Standard Deviation: %.2f\n", standardDeviation);

        // Factorial
        long factorial = 0;

        for (i = 0; i < index; i++) {
            factorial *= oddNUmbers[i];
        }

        System.out.printf("Factorial: %d\n", factorial);
    }
}
