public class ArrayStorage {
    public static void main(String[] args) {
        // 1. Declare and initialize an array storing 5 integers
        int[] scores = {85, 92, 78, 90, 88};

        // 2. Access and print individual elements using index (0-based)
        System.out.println("First score: " + scores[0]);

        // 3. Loop through the array to display all stored data
        System.out.println("\nAll stored scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score " + (i + 1) + ": " + scores[i]);
        }
    }
}