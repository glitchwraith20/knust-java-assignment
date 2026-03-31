import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner minmax = new Scanner(System.in);

        System.out.println("Enter integers one at a time. Enter -99 to finish.");

        Integer smallest = null;
        Integer largest = null;

        while (true) {
            System.out.print("Enter an integer (-99 to end): ");
            while (!minmax.hasNextInt()) {
                System.out.print("Invalid input. Enter an integer (-99 to end): ");
                minmax.next();
            }
            int value = minmax.nextInt();
            if (value == -99) {
                break;
            }
            if (smallest == null || value < smallest) {
                smallest = value;
            }
            if (largest == null || value > largest) {
                largest = value;
            }
        }

        minmax.close();

        if (smallest == null) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("Largest number entered: " + largest);
            System.out.println("Smallest number entered: " + smallest);
        }
    }
}
