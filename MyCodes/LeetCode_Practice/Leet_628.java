class Solution {
    public int maximumProduct(int[] nums) {
        int max = 1;
        int n = nums.length;
        Arrays.sort(nums);

        // Case 1: Product of three largest
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Product of two smallest (negatives) and largest
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);

    }
}
