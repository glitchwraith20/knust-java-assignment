import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner money = new Scanner(System.in);

        double balance = 1000.00;
        int tCount = 0, userAction;

        do {
            System.out.println("ATM Menu.");
            System.out.println("1. Withdraw $100");
            System.out.println("2. Deposit $100");
            System.out.println("0. Exit & Print Receipt");
            System.out.print("Enter your choice: ");
            userAction = money.nextInt();

            if (userAction == 1) {
                if (balance >= 100) {
                    balance -= 100;
                    tCount++;

                    System.out.printf("Withdrawal successful. Balance: $%.2f\n", balance);
                }
                else {
                    System.err.println("Insufficient Funds!");
                }
            }
            else if (userAction == 2) {
                balance += 100;
                tCount++;

                System.out.printf("Deposit successful. Balance: $%.2f\n", balance);
            }

        } while (userAction != 0);

        System.out.printf("Final Balance: $%.2f\n", balance);
        System.out.printf("Total Transactions: %d\n", tCount);

        money.close();
    }
}
