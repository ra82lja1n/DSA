class Solution {
    public static int gcd(int a , int b){
        if(b == 0) return a;

        return gcd(b, a%b);
    }
    
    public long gcdSum(int[] nums) {
        int max = Integer.MIN_VALUE;

        int len = nums.length;

        for(int i = 0; i<len; i++){
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }

        Arrays.sort(nums);

        int i = 0, j = len-1;
        System.out.println(Arrays.toString(nums));
        long sum = 0;
        while(i < j){
            sum += gcd(nums[i++] , nums[j--]);
        }

        return sum;
    }
}