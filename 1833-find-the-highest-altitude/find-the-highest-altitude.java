class Solution {
    public int largestAltitude(int[] gain) {
        int len = gain.length;
        int let = 0;
        int max = 0;

        for(int i = 0; i < len; i++){
            gain[i] = let + gain[i];
            let = gain[i];
            max = Math.max(max, gain[i]);
        }

        return max;
    }
}