class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int limit = -1;

        for(int i : candies){
            limit = Math.max(limit, i);
        }

        for(int i : candies){
            if((i + extraCandies) >= limit ) list.add(true);
            else list.add(false);
        }


        return list;
    }
}