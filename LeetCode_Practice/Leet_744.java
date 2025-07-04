class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        
        int start = 0 ;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2 ;

            if(target < letters[mid]){
                end = mid - 1 ;
            }
            else{
               start = mid + 1 ;
            }
        }
        return letters[start % letters.length] ;
    }
}

public class Leet_744{
    public static void main(String [] args){

        char[] arry = {'c','f','j'};
        char target = 'a';

        Solution obj = new Solution();
        char ans = obj.nextGreatestLetter(arry , target);

        System.out.print(ans);
    }
}