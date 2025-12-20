import java.lang.Exception;
import java.io.FileOutputStream;

public class FileWriteDemo {

    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("abc.txt");
            String s = "Hello World From Devanshu";
            out.write(s.getBytes());
            out.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}