import java.util.*;
class Reverse_req {
    public static void main(String[] args) {
        int reversed = rev1(1234);
        System.out.println(reversed); 
    }

    static int ans = 0;
    public static int rev1(int n) {
            if (n == 0){
               return ans; 
           } 
        ans = ans * 10 + n % 10;
        return rev1(n / 10);
    }
}