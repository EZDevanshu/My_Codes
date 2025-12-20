class Person {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Child class inherits Person
class Student extends Person {
    private int rollNo;

    public Student(String name, int rollNo) {
        super(name); // parent constructor call
        this.rollNo = rollNo;
    }

    public void display() {
        System.out.println("Name: " + getName() + ", Roll No: " + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Devanshu", 101);
        s1.display();
    }
}
