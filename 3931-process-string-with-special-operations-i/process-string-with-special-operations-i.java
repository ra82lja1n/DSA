class Solution {
    public String processStr(String s) {
        StringBuilder ans = new StringBuilder();
        for(char ch : s.toCharArray()){
            switch (ch) {
                case '*' : 
                    if((ans.length())>0)
                    ans.deleteCharAt(ans.length() - 1);
                    break;
                case '#' : 
                    ans.append(ans);
                    break;
                case '%' :
                    ans.reverse();
                    break;
                default : 
                    ans.append(ch);
                    break;

            }
        }


        return ans.toString();
    }
}