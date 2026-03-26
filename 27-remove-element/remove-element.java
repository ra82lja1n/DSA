class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;
        int len = nums.length;
        int count = 0;
        for(int i = 0; i<len; i++){
            if(nums[i] != val){
                nums[k++] = nums[i] ;
                count ++;
            }
        }

        return count;
    }
}