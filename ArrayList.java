import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 3. Access an element by index (0-based)
        System.out.println("First fruit: " + fruits.get(0));

        // 4. Print all elements
        System.out.println("All fruits: " + fruits);

        // 5. Remove an element
        fruits.remove("Banana");

        // 6. Print updated size and list
        System.out.println("Remaining fruits: " + fruits);
        System.out.println("Total count: " + fruits.size());
    }
}