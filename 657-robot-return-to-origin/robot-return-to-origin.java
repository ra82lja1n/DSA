class Solution {
    public boolean judgeCircle(String moves) {
        int origin0 = 0;
        int origin1 = 0;
        

        for(int i = 0 ; i < moves.length(); i++){
            char ch = moves.charAt(i);

            if(ch == 'U'){
                origin0++;
            }else if(ch == 'D'){
                origin0--;
            }else if(ch == 'L'){
                origin1++;
            }else if(ch == 'R'){
                origin1--;
            }
        }

        if(origin0 == 0 && origin1 == 0) return true;

        return false;
    }
}