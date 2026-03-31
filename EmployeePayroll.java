import java.util.Scanner;

public class EmployeePayroll {

    public static void main(String[] args) {

        // CONSTANTS 
        final double SENIOR_RATE = 50.0;
        final double JUNIOR_RATE = 0.7 * SENIOR_RATE;

        final double SENIOR_OVERTIME = 1.5 * SENIOR_RATE;
        final double JUNIOR_OVERTIME = 1.25 * JUNIOR_RATE;

        final double INCOME_TAX_RATE = 0.15;
        final double NHIL_RATE = 0.01;
        final double DISTRICT_TAX_RATE = 0.03;

        final int REGULAR_HOURS = 40;

        Scanner input = new Scanner(System.in);

        String[] staff = {
                "John", "Rose", "Ekua", "Peter", "Ibrahim",
                "Isaac", "Cynthia", "James", "Kweku", "George",
                "Michael", "Emmanuel", "Stephen", "Alfred", "Charles"
        };

        int[] hoursWorked = {
                65, 48, 22, 32, 80,
                12, 45, 25, 33, 67,
                23, 45, 56, 34, 61
        };

        int[] children = {
                3, 0, 6, 5, 10,
                1, 2, 2, 3, 2,
                6, 8, 5, 3, 6
        };

        // Senior staff array (NO HashSet)
        String[] seniorStaff = {
                "John", "Rose", "Cynthia", "George",
                "Emmanuel", "Stephen", "Alfred"
        };

        double totalDeductions = 0;
        double totalNetPay = 0;

        for (int i = 0; i < staff.length; i++) {

            String name = staff[i];
            int hours = hoursWorked[i];
            int numChildren = children[i];

            //  CHECK IF SENIOR 
            boolean isSenior = false;

            for (int j = 0; j < seniorStaff.length; j++) {
                if (seniorStaff[j].equals(name)) {
                    isSenior = true;
                    break;
                }
            }

            // CALCULATE GROSS PAY
            double regularPay = 0;
            double overtimePay = 0;

            if (hours <= REGULAR_HOURS) {
                if (isSenior) {
                    regularPay = hours * SENIOR_RATE;
                } else {
                    regularPay = hours * JUNIOR_RATE;
                }
            } else {
                if (isSenior) {
                    regularPay = REGULAR_HOURS * SENIOR_RATE;
                } else {
                    regularPay = REGULAR_HOURS * JUNIOR_RATE;
                }

                int overtimeHours = hours - REGULAR_HOURS;

                if (isSenior) {
                    overtimePay = overtimeHours * SENIOR_OVERTIME;
                } else {
                    overtimePay = overtimeHours * JUNIOR_OVERTIME;
                }
            }

            double grossPay = regularPay + overtimePay;

            // DEDUCTIONS 
            double incomeTax = INCOME_TAX_RATE * grossPay;
            double nhil = NHIL_RATE * grossPay;
            double districtTax = DISTRICT_TAX_RATE * grossPay;

            double getFund = 0;
            if (numChildren > 3) {
                getFund = (numChildren - 3) * 1.0;
            }

            double totalEmployeeDeduction = incomeTax + nhil + districtTax + getFund;
            double netPay = grossPay - totalEmployeeDeduction;

            totalDeductions += totalEmployeeDeduction;
            totalNetPay += netPay;

            System.out.println("Employee: " + name);
            System.out.println("Gross Pay: " + grossPay);
            System.out.println("Income Tax: " + incomeTax);
            System.out.println("NHIL: " + nhil);
            System.out.println("District Tax: " + districtTax);
            System.out.println("GetFund: " + getFund);
            System.out.println("Net Pay: " + netPay);
        }

        double averageNetPay = totalNetPay / staff.length;

        System.out.println("Total Deductions (All Employees): " + totalDeductions);
        System.out.println("Total Net Pay: " + totalNetPay);
        System.out.println("Average Net Pay: " + averageNetPay);

        input.close();
    }
}