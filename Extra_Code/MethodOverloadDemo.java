class MethodOverloadDemo {
    
    // Method with one parameter
    static void display(int num) {
        System.out.println("Integer: " + num);
    }
    
    // Overloaded method with two parameters
    static void display(int num1, int num2) {
        System.out.println("Sum: " + (num1 + num2));
    }
    
    // Overloaded method with a different parameter type
    static void display(String message) {
        System.out.println("Message: " + message);
    }
    
    public static void main(String[] args) {
        display(10);          // Calls first method
        display(10, 20);      // Calls second method
        display("Hello!");  // Calls third method
    }
}