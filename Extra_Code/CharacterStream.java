import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.Exception;

public class CharacterStream {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\Dev Codes\\JAVA DEV - 281\\PRACTICE CODE\\Hello.txt"));
            System.out.println(br.readLine());
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
