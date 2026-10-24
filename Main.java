class Student {
    String name;

    // Default Constructor
    Student() {
        name = "Unknown";
        System.out.println("Default Constructor Called");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student(); // Invokes default constructor
        System.out.println("Name: " + s.name);
    }
}