class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] ans = new int[l1+l2];

        int i = 0, j = 0, k = 0;

        while(i < l1 && j < l2){
            if(nums1[i] < nums2[j]){
                ans[k++] = nums1[i++];
            }else{
                ans[k++] = nums2[j++];
            }
        }

        while(i < l1){
            ans[k++] = nums1[i++];
        }

        while(j < l2){
            ans[k++] = nums2[j++];
        }

        int len = l1 + l2;

        if(len % 2 == 1){
            return ans[len/2];
        }else{
            return (ans[len/2] + ans[len/2-1]) / 2.0;
        }

        
        
    }
}