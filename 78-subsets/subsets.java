class Solution {

    public static void solve(List<List<Integer>> ans, List<Integer> output, int index, int[] nums){

        if(index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        // exclude

        solve(ans, output, index+1, nums);

        // include
        int ele = nums[index];
        output.add(ele);
        
        solve(ans, output, index+1, nums);
        

        // backtract to remove last item

        output.remove(output.size() - 1);


    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;

        solve(ans, output, index, nums);

        return ans;
    }
}