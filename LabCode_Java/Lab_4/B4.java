import java.util.Scanner;

public class B4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();

		System.out.println("length of String is : " + str.length());
		 

		for(int i = str.length() / 2 ; i < str.length() ; i++){
			System.out.print(str.charAt(i));

		}
	}
}