class Solution {

    public char findKthBit(int n, int k) {

        // Base case: S1 = "0"
        if (n == 1) return '0';

        // Length of Sn = 2^n - 1
        int length = (1 << n) - 1;

        // Middle position of Sn
        int mid = (length + 1) / 2;

        // If k is exactly middle, answer is always '1'
        if (k == mid) return '1';

        // If k is in first half, same as S(n-1)
        if (k < mid) {
            return findKthBit(n - 1, k);
        } 
        else {
            // If k is in second half:
            // Mirror the index
            int newK = length - k + 1;

            // Get value from S(n-1)
            char ch = findKthBit(n - 1, newK);

            // Invert the result (0->1, 1->0)
            return ch == '0' ? '1' : '0';
        }
    }
}