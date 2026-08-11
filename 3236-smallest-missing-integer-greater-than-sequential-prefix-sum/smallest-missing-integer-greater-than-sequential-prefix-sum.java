class Solution {
    public int missingInteger(int[] nums) {
        int max = nums[0];
        int longest = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1])
                longest += nums[i + 1];
            else
                break;
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (longest == nums[i])
                longest++;
        }

        return longest;
    }
}