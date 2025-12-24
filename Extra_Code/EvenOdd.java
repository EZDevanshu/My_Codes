public class EvenOdd {
    public static void main(String[] args) {
        int num = 11;

        int ans = num & 1;
        if (ans == 1) {
            System.out.println("Number is Odd");
        } else {
            System.out.println("Number is Even");
        }
    }
}
