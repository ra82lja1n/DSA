class Solution {
    public int minimumCost(int[] cost) {
        if(cost.length < 1) return cost[0];
        Arrays.sort(cost);
        int len = cost.length - 1;
        int total = 0;

        for(int i = len; i >= 0; i = i-3){
            if(i == 0){
                total += cost[i];
                break;
            }
            total = total + cost[i] + cost[i-1];
        }

        return total;
    }
}