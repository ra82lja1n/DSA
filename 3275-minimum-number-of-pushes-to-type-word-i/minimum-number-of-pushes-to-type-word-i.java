class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int ans = 0;
        int remain = len % 8;
        int t = len/8;
        int mul = 1;
        while(t --> 0){
            ans += (8 * mul++);
        }
        ans += (mul * remain);
        return ans;
    }
}