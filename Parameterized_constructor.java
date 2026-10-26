class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }

    public static void main(String[] args) {
        // Passing arguments while creating objects
        Student s1 = new Student("Alice", 20);
        Student s2 = new Student("Bob", 22);

        s1.display(); // Output: Alice is 20 years old.
        s2.display(); // Output: Bob is 22 years old.
    }
}