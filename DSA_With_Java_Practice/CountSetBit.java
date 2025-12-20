class CountSetBit{
	public static void main(String[] args) {
		int n = 7;
		int count = 0 ;

		// mathod 1

		// while(n > 0){
		// 	count++;
		// 	n -= (n & (-n));
		// }

		// mathod 2

		while(n > 0){
			count++;
			n = n & (n - 1);
		}

		System.out.println("Total Number of set Bits in Binary number :" +count);
	}
}