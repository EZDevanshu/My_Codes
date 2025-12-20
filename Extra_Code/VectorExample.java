import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3); // Initial capacity is 3
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Size: " + v.size());        // Output: 3
        System.out.println("Capacity: " + v.capacity()); // Output: 3

        v.add(40); // Triggers capacity increase

        System.out.println("Size after adding another: " + v.size());        // Output: 4
        System.out.println("Capacity after adding another: " + v.capacity()); // Output: 6 (doubles +1 if needed)
    }
}

