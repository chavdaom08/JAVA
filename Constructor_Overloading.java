class Student {
    String name;
    int age;

    // 1. Default constructor (no parameters)
    Student() {
        name = "Unknown";
        age = 0;
    }

    // 2. Overloaded constructor (one parameter)
    Student(String n) {
        name = n;
        age = 18; // default age
    }

    // 3. Overloaded constructor (two parameters)
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Calling different constructors
        Student s1 = new Student();
        Student s2 = new Student("Alice");
        Student s3 = new Student("Bob", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}