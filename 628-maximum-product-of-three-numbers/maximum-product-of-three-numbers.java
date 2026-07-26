class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int l = nums.length;

        int ans1 = nums[0] * nums[1] * nums[l-1];

        int ans2  = nums[l-3] * nums[l-2] * nums[l-1];
        

        return ans1>ans2? ans1 : ans2;
    }
}