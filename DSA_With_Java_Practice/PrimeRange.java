class PrimeRange{
	public static void main(String[] args) {
		int n = 40;
		boolean [] primes = new boolean[n + 1]; 
	}

	static void range(int n , boolean []primes){
		for (int i = 2 ; i*i <= n ; i++){
			if(!primes[i]){
				for (int j = 2 ; j <= n ; j++){
					primes[i] = true;
				}
			}
		}
		for (int i = 2 ; i <= n ; i++){
			if(!primes[i]){
				System.out.println(i + " ");
			}
		}
	}
}