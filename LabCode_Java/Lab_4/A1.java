import java.util.Scanner;

public class A1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.nextLine();
		int vowel=0,consonants=0,count=0;

		for(int i = 0 ; i < str.length() ; i++){
			char temp = str.charAt(i);

			if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u' || temp == 'A' || temp == 'E'|| temp == 'I'|| temp == 'O'|| temp == 'U'){
				vowel++;
			}
			 else if(temp==' '){
				continue;
			}
			else{
				consonants++;
			}
		}

		System.out.println("Vowels in the string is : " + vowel);
		System.out.print("consonants in the string is : " + consonants);

	}


}