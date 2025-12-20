import java.util.Scanner;

public class PrimeRange {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int star = sc.nextInt();
                int end = sc.nextInt();
                for (int j = star; j <= end; j++) {

                        int count = 0;
                        for (int i = 2; i <= j / 2; i++) {
                                if (j % i == 0) {
                                        count++;
                                        break;
                                }
                        }
                        if (count == 0) {
                                System.out.println("Prime :" + j);
                        }
                }

        }
}
