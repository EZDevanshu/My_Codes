import java.util.Scanner;
import java.lang.Exception;

public class BankDemo {
    public static void main(String[] args) {
        int balance = 5000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to Withdraw");
        int Withdraw = sc.nextInt();
        try {
            if (balance - Withdraw <= 1000) {
                System.out.println("Amount must be gratter than 1000");
            } else {
                balance = balance - Withdraw;
            }
            System.out.println("Curent balance is "+ balance);
        } catch (Exception e) {
            e.printStackTrace();

        }finally{
            sc.close();
        }
    }
}
