import java.lang.Exception;
import java.io.FileInputStream;
public class FileReadDemo {
    public static void main(String[] args) {
        try {
              FileInputStream in = new FileInputStream("abc.txt");
              int store;
               while(  (store =in.read() )!= -1){
                 System.out.print((char) store);
               }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
