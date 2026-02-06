import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input scores
        System.out.print("Enter exam score: ");
        int exam = input.nextInt();

        System.out.print("Enter assessment score: ");
        int assessment = input.nextInt();

        System.out.print("Enter fees score: ");
        int fees = input.nextInt();

        boolean examPass = exam >= 25;
        boolean assessmentPass = assessment >= 15;

        boolean normalPass = examPass && assessmentPass;

        boolean condoned = (exam + assessment == 39) && exam > 0 && assessment > 0;

        // Inform pass/fail for each component
        if (examPass) {
            System.out.println("Exam: PASSED");
        } else {
            System.out.println("Exam: FAILED");
        }

        if (assessmentPass) {
            System.out.println("Assessment: PASSED");
        } else {
            System.out.println("Assessment: FAILED");
        }

        // Determine result
        if ((normalPass || condoned)) {
            if (fees == 100) {
                System.out.println("Status: CERTIFICATE ISSUED");
            } else {
                System.out.println("Status: PASSED BUT FEES NOT COMPLETE");
            }

            if (condoned && !normalPass) {
                System.out.println("Note: Student was CONDONED");
            }
        } else {
            System.out.println("Status: FAILED");

            if (!examPass && !assessmentPass) {
                System.out.println("Action: STUDENT IS REPEATED");
            }
        }

        input.close();
    }
}