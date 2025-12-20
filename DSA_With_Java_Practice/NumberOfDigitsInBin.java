public class NumberOfDigitsInBin{
	public static void main(String[] args) {
		int n = 16 ;
		int b = 2 ;

		int digits = (int)(Math.log(n) / Math.log(b)) + 1;

		System.out.println(digits);
	}
}