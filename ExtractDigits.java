public class ExtractDigits {
    public static void main(String[] args) {
        int number = 5824;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            System.out.println(digit);
            number = number / 10;    // Remove the last digit
        }
    }
}