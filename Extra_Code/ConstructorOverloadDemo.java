class ConstructorOverloadDemo {
    int num;
    String text;

    // Constructor with one parameter
    ConstructorOverloadDemo(int n) {
        num = n;
        text = "Default Text";
    }

    // Overloaded constructor with two parameters
    ConstructorOverloadDemo(int n, String t) {
        num = n;
        text = t;
    }

    void display() {
        System.out.println("Number: " + num + ", Text: " + text);
    }

    public static void main(String[] args) {
        ConstructorOverloadDemo obj1 = new ConstructorOverloadDemo(10);
        ConstructorOverloadDemo obj2 = new ConstructorOverloadDemo(20, "Hello");
        
        obj1.display();
        obj2.display();
    }
}
