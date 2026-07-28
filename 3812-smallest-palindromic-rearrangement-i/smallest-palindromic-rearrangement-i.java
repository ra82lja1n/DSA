class Solution {
    public String smallestPalindrome(String s) {
        if(s.length() == 1) return s;
        int[] arr = new int[26];
        int len= s.length();
        for(int i = 0; i<len; i++){
            char ch = s.charAt(i);

            arr[ch - 'a'] = (arr[ch - 'a']) + 1;

        }
        
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        int k = -1;
        for(int i = 0 ; i < 26; i++){
            int n = arr[i]/2;

            while(n --> 0){
                ans.append((char) (i + 'a'));
            }

            if(arr[i]%2 == 1){
                flag = true;
                k = i;
            }
        }

        StringBuilder p2 = new StringBuilder();
        p2.append(new StringBuilder(ans).reverse());

        if(flag){
            ans.append((char) ('a' + k));

            return (ans.append(p2)).toString();

        }


        return ans.append(p2).toString();
    } 
}