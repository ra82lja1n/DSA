class Solution {
    public int trap(int[] height) {
        int hl = height.length;
        int[] lmax = new int[height.length];
        int[] rmax = new int[height.length];

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i<hl; i++){
            if(max < height[i]){
                max = height[i];
                lmax[i] = max;
            }
            else lmax[i] = max;
        }

        max = Integer.MIN_VALUE;

        for(int i = hl-1 ; i >= 0; i--){
            if(max < height[i]){
                max = height[i];
                rmax[i] = max;
            }
            else rmax[i] = max;
        }

        int ans = 0;

        for(int i = 0 ; i < hl; i++){
            ans += Math.min(lmax[i] , rmax[i]) - height[i];
        }
        return ans;
    }
}