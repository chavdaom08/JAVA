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


// CallByReferenceDemo

public class CallByReferenceDemo {
    public static void main(String[] args) {
        int[] number = { 10 }; // Array holding a single value

        System.out.println("Before method: " + number[0]);
        modifyValue(number);
        System.out.println("After method:  " + number[0]);
    }

    // Modifies the original value inside the array
    static void modifyValue(int[] num) {
        num[0] = num[0] + 50;
    }
}