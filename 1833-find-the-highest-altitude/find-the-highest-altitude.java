class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int[] ans = new int[len+1];
        ans[0] = 0;
        int max = 0;

        for(int i = 1; i < len+1; i++){
            ans[i] = ans[i-1] + gain[i-1];
            max = Math.max(max, ans[i]);
        }


        return max;

        
    }
}