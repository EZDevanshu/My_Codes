import java.util.Scanner;

public class A3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = sc.nextInt();

		int revers[] = new int[size];

		for(int i = 0 ; i < size ; i++){
			System.out.print("Enter " + i + " "+ "index of array element : ");
			revers[i] = sc.nextInt();
		}
		System.out.println("Origanal Array is : ");
		for(int i = 0 ; i < size ; i++){
			System.out.print(revers[i]+ " ");
		}
		System.out.println(" ");

		System.out.println("Revers Array is : ");
		for(int i = size-1 ; i >= 0 ; i--){
			System.out.print(revers[i]);
		}


	}
}