import java.util.Scanner;

public class StringLength{
	public static void main(String [] args){

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the String : ");
			String str = sc.nextLine();
			System.out.println("this is half String ");
			for(int i = 0 ; i<=str.length()/2 ;i++ ){
			
				System.out.print(str.charAt(i));
			}
			System.out.println();

			System.out.println("String length :" +str.length());
	}
}