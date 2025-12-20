// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f32*5/9 );[B]

import java.util.Scanner;

public class LabB1 {
    public static void main (String args []){

         Scanner sc= new Scanner(System.in);

         System.out.println("Enter Temp in Fahrenheit = ");

         double a= sc.nextInt();

         System.out.println("Temp in Calsius = "+((a-32)*(0.5556)));

    }
    
}
