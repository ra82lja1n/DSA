class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> list = new ArrayList<>();
        int len = nums.length;
        int t = 0;
        int count = 0;

        for(int i = 0; i<len; i++){
            if(nums[i] < pivot) nums[t++] = nums[i];
            else if (pivot == nums[i]) count++;
            else list.add(nums[i]);
        }

        while(count --> 0) nums[t++] = pivot;

        for(int i : list) nums[t++] = i;

        return nums;
    }
}