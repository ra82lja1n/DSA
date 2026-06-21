class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int result = 0;
        for(int i : costs){
            coins -= i;
            if(coins >= 0){
                result++;
            }
            if(coins < 0) break;
            
        }

        return result;

        
    }

}