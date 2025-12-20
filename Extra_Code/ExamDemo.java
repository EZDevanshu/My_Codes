import java.lang.Exception;
public class ExamDemo {
    public static void main(String[] args) {
        int i, ans = 0;

        try {
            for (i = -1; i < 3; ++i) {
                System.out.println(i);
                ans /= i;
            }
        } catch (Exception e) {
            System.out.println("0");
        }

        System.out.println(ans);
    }
}
