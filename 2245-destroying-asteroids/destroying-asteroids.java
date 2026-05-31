class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long volume = mass;
        for(int i : asteroids){
            if(volume >= i) volume += i;
            else return false;
        }

        return true;
    }
}