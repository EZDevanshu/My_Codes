import java.util.*;

class Solution {
    public boolean judgeSquareSum(int c) {
       int a = 0;
       int b = (int)Math.sqrt(c);

        while(a <= b){
            long sum = a*a + b*b;

            if(sum == c){
                return true;
            }
            else if(sum < c) {
                a++;
            }
            else{
                b--;
            }
       }
       return false;
    }
}

class Leet_633{
    public static void main(String[] args) {
        int n = 2147483600;

        Solution obj = new Solution();

        System.out.println(obj.judgeSquareSum(n));
    }
}

// c = 2147483600

// ans should be true 
// pair = 45800^2 + 7060^2

