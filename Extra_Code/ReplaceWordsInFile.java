import java.io.*;
import java.util.Scanner;
import java.lang.Exception;

public class ReplaceWordsInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));

            String stringRead;
            int count  = 0 ;

            while ((stringRead = in.readLine()) != null) {
                String rePlace = stringRead.replace("Word1", "Word2");
                out.write(rePlace); 
                out.flush();
                out.newLine();
                count++; 

            }
            System.out.println(count);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
}