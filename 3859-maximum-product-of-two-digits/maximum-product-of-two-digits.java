class Solution {
    public int maxProduct(int n) {
        int mf = 0;
        int ms = 0;
        while (n > 0) {
            int t = n % 10;
            if (t >= mf) {
                ms = mf;
                mf = t;
            }else if(t > ms){
                ms = t;
            }
            n /= 10;
        }

        return mf * ms;
    }
}