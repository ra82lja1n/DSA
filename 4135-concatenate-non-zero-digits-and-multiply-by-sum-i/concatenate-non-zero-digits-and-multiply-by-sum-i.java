class Solution {
    public long sumAndMultiply(int n) {
        int k = 0;
        int sum = 0;
        int helper = 1;
        while (n > 0) {
            int t = n % 10;
            sum += t;
            if (t > 0) {
                k = t * helper + k;
                helper *= 10;
            }
            n /= 10;

        }

        return (long) k * sum;
    }
}