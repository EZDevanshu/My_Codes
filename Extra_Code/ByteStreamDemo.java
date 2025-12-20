import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;

public class ByteStreamDemo {
    public static void main(String[] args) {
        try {
        FileInputStream fis = new FileInputStream("D:\\Dev Codes\\JAVA DEV - 281\\PRACTICE CODE\\Hello.txt");
        FileOutputStream fos = new FileOutputStream("D:\\Dev Codes\\JAVA DEV - 281\\PRACTICE CODE\\HelloCopied.txt");

        int a = fis.read();
        while(a != -1){
        fos.write(a);
        a = fis.read();
        }

        } catch (Exception e) {
        e.printStackTrace();
        }
    }
}