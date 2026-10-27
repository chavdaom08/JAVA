class Student {
    String name;
    int age;

    // Standard Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create original object
        Student s1 = new Student("Alice", 20);

        // Pass s1 to create a copy s2
        Student s2 = new Student(s1);

        // Display values
        s1.display(); // Output: Alice - 20
        s2.display(); // Output: Alice - 20
    }
}