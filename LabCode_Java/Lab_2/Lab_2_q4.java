import java.util.Scanner;

public class Lab_2_q4{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.println("Enter Temperature in Fahrenheit : ");
	double temprature = in.nextDouble();

	System.out.println("Temperature in Celsius :" +((temprature-32)*(5/9)) );		
	}
}