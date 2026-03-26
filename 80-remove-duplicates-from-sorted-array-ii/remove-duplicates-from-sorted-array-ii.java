class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k = 1;
        int s = 0;
        int len = nums.length;
        int count = 1;
        for(int i = 1 ; i<len ; i++){
            if(nums[i] == nums[i-1] && s == 0){
                nums[k++] = nums[i];
                count++;
                s = 1;
            }else if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
                count ++;
                s = 0;
            }else{

            }

        }
        System.out.println(count);
        return count;
    }
}