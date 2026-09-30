/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int[] maxi = new int[1];
    public int maxPathSum(TreeNode root) {
        maxi[0] = Integer.MIN_VALUE;
        solve(root);
        return maxi[0];
    }
    
    public int solve(TreeNode root){
        if(root == null) return 0;

        int lSum = solve(root.left);
        if(lSum < 0) lSum = 0; 
        int rSum = solve(root.right);
        if(rSum < 0) rSum = 0; 

        maxi[0] = Math.max(maxi[0], (lSum + rSum+ root.val));

        return root.val + Math.max(lSum , rSum);
    }
}