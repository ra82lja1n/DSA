class Solution {
    public int maxDepth(String s) {
        int max = 0;
        int len = s.length();
        int sound = 0;
        for(int i = 0 ; i < len; i++){
            char ch = s.charAt(i);
            if(ch == '(')
            {
                sound++;
                if(max < sound) max = sound;
            }
            else if(ch == ')') sound--;

        }

        return max;
    }
}