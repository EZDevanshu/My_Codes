import java.lang.ArithmeticException;
import java.lang.Exception;
import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        try {
            int c = a / b;
            System.out.println("ans : " + c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            
        } 
        catch(Exception ea){
                System.out.println("multiple catch is allow in java...");
        }finally {
            System.out.println("Good Bye.....!!");
            s.close();
        }

    }
}