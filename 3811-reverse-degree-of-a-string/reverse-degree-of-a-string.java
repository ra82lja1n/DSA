class Solution {
    public int reverseDegree(String s) {
        int ans = 0 , len = s.length();
        for(int i = 0; i<len; i++)
            ans += (i+1) * (26 - ((s.charAt(i)) - 'a'));
        return ans;
    }
}