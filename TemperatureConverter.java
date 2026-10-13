import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Conversion Menu ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.print("Choose an option (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();
        double converted = 0;

        switch (choice) {
            case 1:
                converted = (temp * 9 / 5) + 32;
                System.out.println(temp + "°C = " + converted + "°F");
                break;
            case 2:
                converted = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F = " + converted + "°C");
                break;
            case 3:
                converted = temp + 273.15;
                System.out.println(temp + "°C = " + converted + " K");
                break;
            case 4:
                converted = temp - 273.15;
                System.out.println(temp + " K = " + converted + "°C");
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}