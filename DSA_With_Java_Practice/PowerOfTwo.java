class PowerOfTwo{
	public static void main(String[] args) {
		int n = 0;

		int ans = n & (n - 1);
		if(ans == 0){
			System.out.println("This is Power of Two");
		}
		else{
			System.out.println("This is Not Power of Two");
		}
	
	}
}