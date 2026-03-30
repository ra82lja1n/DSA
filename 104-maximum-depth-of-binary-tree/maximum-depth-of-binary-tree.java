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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        int level = 0;

        while(true){

            int currQ = que.size();

            if(currQ == 0) return level;

            while(currQ > 0){
                TreeNode ele = que.poll();
                if(ele.left != null){
                    que.add(ele.left);
                }
                if(ele.right != null){
                    que.add(ele.right);
                }
                currQ--;
            }
            level++;
        }

        

    }
}