class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int vote = 0;

        for(int i : nums){
            if(vote == 0){
                candidate = i;
                vote++;
            } 
            else if(i == candidate) vote++;
            else vote--;
        }

        return candidate;
    }
}