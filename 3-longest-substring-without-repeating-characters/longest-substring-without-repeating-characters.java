class Solution {
    public int lengthOfLongestSubstring(String s) {
      
        int len = 0;
        int n = s.length();


            for(int i = 0;i<n;i++){
                HashSet<Character> hash = new HashSet<>();
                int temp = 0;
                for(int j = i;j<n;j++){
                    if(hash.contains(s.charAt(j))){
                        break;
                    }
                    else{
                        hash.add(s.charAt(j));
                        temp++;
                   }
                    len = Math.max(temp,len);
                }

            }
        return len;

        
    }
}