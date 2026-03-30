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
    // Approach : LevelOrder + Queue
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;

        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            final TreeNode node = que.poll();

            final TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null) que.add(node.left);
            if(node.right != null) que.add(node.right);

        }

        return root;
    }
}