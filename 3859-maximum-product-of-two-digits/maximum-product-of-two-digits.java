class Solution {
    public int maxProduct(int n) {
        int mf = -1;
        int ms = -1;
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
            System.out.println(mf);
            System.out.println(ms);
            return mf * ms;
    }
}