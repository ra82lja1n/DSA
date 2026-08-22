class Solution {
    public boolean checkDivisibility(int n) {
        int k = n;
        int sum = 0;
        int mult = 1;
        while(k > 0){
            int t = k%10;
            k /= 10;
            sum += t;
            mult *= t;
        }
        return  n % (sum + mult) == 0 ? true : false;
    }
}