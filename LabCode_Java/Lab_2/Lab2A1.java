
// Write a program to create basic calculator by getting 2 numbers and 1 string (operation)
// from the user and apply the operation given in a string on the given numbers.[A]
import java.util.Scanner;

public class Lab2A1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr Number a = ");
        int a = sc.nextInt();

        System.out.println("Enetr Number b = ");
        int b = sc.nextInt();

        System.out.println("Enetr Operation = ");
        String str = sc.next();

        if (str.equals("+")) {
            System.out.println(a + b);

        } else if (str.equals("-")) {
            System.out.println(a - b);

        } else if (str.equals("*")) {
            System.out.println(a * b);
            
        } else if (str.equals("/")) {
            System.out.println( "diviton is "+(a / b));
        }
        else {
            System.out.println("not valid");
        }
    }
}
