class Solution {
    public int maxArea(int[] arr) {

        int maxArea = 0 ;
        int left = 0 , right = arr.lenght - 1;

        while(left < right){
            maxArea = (arr[left] * arr[right] * (left - right));
            if(arr[left] < arr[right]){
                left++;
            }
            else{
                right--;
            }
        }

        return maxArea;
    }
}
