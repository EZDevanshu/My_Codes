class Solution {
    public int[] plusOne(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] + 1 != 10) {
                arr[i] += 1;
                return arr;
            }
            arr[i] = 0;
        }
        
        int[] newDigits = new int[arr.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
}
