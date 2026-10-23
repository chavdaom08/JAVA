import java.util.Scanner;

public class AdmissionCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student grade percentage: ");
        double grade = scanner.nextDouble();

        if (grade >= 75) {
            System.out.println("Eligible for Admission!");
        } else {
            System.out.println("Not Eligible for Admission.");
        }

        scanner.close();
    }
}