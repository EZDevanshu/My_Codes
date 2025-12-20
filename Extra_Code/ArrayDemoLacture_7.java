import java.util.Arrays;

public class ArrayDemoLacture_7{
    public static void main(String [] args){
        arry(13,3,131,36,123,5,6,56);
        
    }
     
     static void arry(int ...var){
        System.out.println(Arrays.toString(var));
     }
}