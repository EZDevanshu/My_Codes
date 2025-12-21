import java.util.*;
import java.util.BigInteger;

class Solution {
    public List<List<Integer>> generate(int numRows) {
     
    List<List<Integer>> tringle = new ArrayList<>();

	    for (int n = 0 ; n < numRows ; n++){
	    	List<Integer> row = new ArrayList<>();
	  		for(int r = 0 ; r <= n ; r++){
	  			row.add(nCr(n,r).intValue());
	  		}
	  		tringle.add(row);
	    }
	    return tringle;	
    }
	static long nCr(int n , int r){
		return factorial(BigInteger.valueOf(n))
            .divide(factorial(BigInteger.valueOf(r))
            .multiply(factorial(BigInteger.valueOf(n - r))));
	} 

	static BigInteger factorial(BigInteger n) {
        BigInteger fact = BigInteger.ONE;
        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            fact = fact.multiply(i);
        }
        return fact;
    }
}
class Leet_118{
	public static void main(String[] args) {
		int n = 5;

		Solution obj = new Solution();
		List<List<Integer>> result = obj.generate(n);

		System.out.println(result);
	}
}