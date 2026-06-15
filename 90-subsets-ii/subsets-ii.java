class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void solve(int[] nums, int idx, List<Integer> output){

        if(idx >= nums.length){
            if(!(ans.contains(output)))
            ans.add(new ArrayList<>(output));
            return ;
        }

        // exclude

        solve(nums, idx+1, output);

        // include

        output.add(nums[idx]);
        solve(nums, idx+1, output);

        // delete ele

        output.remove(output.size()-1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> output = new ArrayList<>();
        int idx = 0;

        solve(nums, idx, output);

        return ans;
    }
}