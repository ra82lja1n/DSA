class Solution {
    public int smallestIndex(int[] nums) {
        int len = nums.length;
        if(nums[0] == 0) return 0;
        for(int i = 1; i < len; i++){
            int k = nums[i];

            int sum = 0;

            while(k > 0){
                sum += k%10;
                k /= 10;
            }

            if(i == sum) return i;
        }

        return -1;
    }
}