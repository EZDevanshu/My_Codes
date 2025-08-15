import java.io.*;
import java.util.*;

public class FileCompile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the filename : ");
        String filename = sc.nextLine();

        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));

            int count = 0;
            String read;

            while ((read = in.readLine()) != null) {
                int i = 0;
                while (i < read.length()) {
                    char ch = read.charAt(i);
                    if (ch == 'i') {
                        count++;
                    }
                    i++;
                }
            }

            in.close();
            System.out.println("Count of 'i': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
