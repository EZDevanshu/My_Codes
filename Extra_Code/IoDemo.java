import java.io.File;

public class IoDemo{
    public static void main(String [] args){
        File myFile = new File("D:\\Dev Codes\\JAVA DEV - 281\\PRACTICE CODE\\Hello.txt");
        if(myFile.exists()){
            System.out.println("File dose exists");
        }
        else{
            System.out.println("File dose not exists");
        }
    }
}