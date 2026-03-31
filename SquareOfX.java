import java.util.Scanner;

public class SquareOfX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        do {
            System.out.print("Enter a positive integer no greater than 15: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Enter a positive integer no greater than 15: ");
                scanner.next();
            }
            size = scanner.nextInt();
            if (size < 1 || size > 15) {
                System.out.println("Please enter a value between 1 and 15.");
            }
        } while (size < 1 || size > 15);

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print("X");
            }
            System.out.println();
        }

        scanner.close();
    }
}
