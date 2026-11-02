public class CallByValueExample {

    public static void main(String[] args) {
        int number = 10;

        System.out.println("Before method call: " + number);
        
        // Passing 'number' by value (a copy is passed)
        changeValue(number);
        
        System.out.println("After method call: " + number);
    }

    public static void changeValue(int num) {
        num = 50; // Changes only the local copy inside this method
    }
}