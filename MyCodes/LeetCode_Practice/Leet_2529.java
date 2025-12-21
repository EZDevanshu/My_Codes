class Solution {
    public int maximumCount(int[] nums) {
        // Edge cases
        if (nums[0] > 0) return nums.length; // all positives
        if (nums[nums.length - 1] < 0) return nums.length; // all negatives
        if (nums[0] == 0 && nums[nums.length - 1] == 0) return 0; // all zeros

        int low = 0, high = nums.length - 1, mid = 0;

        //  Find count of negatives using binary search
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] < 0) {
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }
        int neg = high + 1; // number of negatives

        //  Find count of positives using binary search
        high = nums.length - 1; // reset high
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] <= 0) {
                low = mid + 1;   // skip zeros & negatives
            } else {
                high = mid - 1;  
            }
        }
        int pos = nums.length - low; // number of positives

        //  Return max
        return Math.max(pos, neg);
    }
}
