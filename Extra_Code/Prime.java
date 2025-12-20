import java.util.Scanner;

public class Prime{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int count = 0 ; 

		System.out.println("Enter Start number :");
		int start = sc.nextInt();

		System.out.println("Enter End number :");
		int end = sc.nextInt();

		for(int i = start ; i<=end ; i++){

			 if(i%2 != 0){
			 	System.out.println(i);
			 	count++;
			 }
		}
		System.out.println("total prime number in your range: "+ count);

	}
}