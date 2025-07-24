import java.util.Scanner;

public class A2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of arrya : ");
		int size = sc.nextInt();
		

		int avg[] = new int[size];
		int sum=0;

		for(int i = 0; i < size; i++){
			System.out.print("Enter " + i + " "+ "index of array element : ");
			 avg[i] = sc.nextInt();
		}

		for(int i = 0; i < size; i++){
				sum+=avg[i];
		}
		System.out.print(" Avg is : " + (sum / (size*1.0)));
	}
}