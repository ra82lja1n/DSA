class Solution {
    public long sumAndMultiply(int n) {
        long k = 0;
        long sum = 0;
        long helper = 1;
        while (n > 0) {
            int t = n % 10;
            sum += t;
            if (t > 0) {
                k = t * helper + k;
                helper *= 10;
            }
            n /= 10;

        }

        return k * sum;
    }
}