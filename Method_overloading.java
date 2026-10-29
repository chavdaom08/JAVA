class Calculator {
    // Method 1: Adds two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method 2: Overloaded to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Overloaded to add two double (decimal) numbers
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));        // Output: 15
        System.out.println(calc.add(5, 10, 15));    // Output: 30
        System.out.println(calc.add(2.5, 3.5));     // Output: 6.0
    }
}