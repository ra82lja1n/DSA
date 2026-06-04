class Solution {
    public int totalWaviness(int num1, int num2) {
        int result = 0;
        for(int i = num1; i<=num2; i++){
            if(i > 99)
            result += opr(i);
        }
        return result;
    }

    public int opr(int num){
        String s = ""+num;
        int len = s.length()-1;
        int count = 0;
        for(int i = 1 ; i<len; i++){
            if(s.charAt(i-1) < s.charAt(i) && s.charAt(i) > s.charAt(i+1)) count++;
            if(s.charAt(i-1) > s.charAt(i) && s.charAt(i) < s.charAt(i+1)) count++;
        }
        return count;
    }
}