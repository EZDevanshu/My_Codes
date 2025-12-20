class Student {
    private String name; // private variable

    public void setName(String n) { // setter
        name = n;
    }

    public String getName() { // getter
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Devanshu"); // set value
        System.out.println("Student name: " + s.getName()); // get value
    }
}
