class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] arr = new int[26];

        for(int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);
            arr[ch - 'a'] = arr[ch - 'a'] + 1;
        }

        String s = "balon";
        int min = Integer.MAX_VALUE;

        arr['l' - 'a'] =  (arr['l' - 'a']) / 2;
        arr['o' - 'a'] = (arr['o' - 'a']) / 2;

        for(int i = 0 ; i < s.length(); i++){
            min =  Math.min(arr[s.charAt(i) - 'a'] , min);
        }

        return min;
    }
}