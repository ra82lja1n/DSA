class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i<len; i++){
            if(map.containsKey(nums[i])){
                int n = map.get(nums[i]);

                if(Math.abs(n - i) <= k) return true;
                
                 map.put(nums[i],i);

            }else{
                map.put(nums[i],i);
            }
        }

        return false;
    }
}