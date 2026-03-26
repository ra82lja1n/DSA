class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if (len < 2) return;

        k = k % len;
        if (k == 0) return;

        // 1. Reverse the first part 
        reverse(nums, 0, len - k - 1);

        // 2. Reverse the second part
        reverse(nums, len - k, len - 1);

        // 3. Reverse the whole array 
        reverse(nums, 0, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}