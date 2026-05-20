class Solution { 
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int len = A.length;
        int[] freq = new int[len+1];
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < len; i++){
            int a = A[i];
            freq[a] = (freq[a]) + 1;
            if(freq[a] == 2){
                count++;
            }

            int b = B[i];
            freq[b] = (freq[b]) + 1;
            if(freq[b] == 2){
                count++;
            }

            list.add(count);
        }

        int[] ans = new int[len];

        for(int i = 0; i<len; i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}