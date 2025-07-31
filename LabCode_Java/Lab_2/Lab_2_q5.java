import java.util.Scanner;

public class Lab_2_q5{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	System.out.println("Enter first number :");	
	int a = in.nextInt();

	System.out.println("Enter the second number : ");
	int b = in.nextInt();

	System.out.println("Entr the third number :");
	int c = in.nextInt();

	int ans = (a>b) ?
	 		  ((a>c)? a : c ) :
	  		  ((b>c) ? b : c) ; 
	  	System.out.println("Largedt number is : " +ans);
	}
}