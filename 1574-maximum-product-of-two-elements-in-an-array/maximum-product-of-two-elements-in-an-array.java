class Solution {
    public int maxProduct(int[] nums) {
        int max = -1;
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            for(int j = i+1; j < len; j++){
                max = Math.max(max, (nums[i]-1)*(nums[j]-1));
            }
        }

        return max;
    }
}