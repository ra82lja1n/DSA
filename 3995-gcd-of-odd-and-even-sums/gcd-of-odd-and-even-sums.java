class Solution {
    private int gcd(int x , int y){
        return y == 0 ? x : gcd(y, x % y);
    }
    public int gcdOfOddEvenSums(int n) {
        int even = n *(n + 1);
        int odd = n * n;

        return gcd(even , odd);
    }
}