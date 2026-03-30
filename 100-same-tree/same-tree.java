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
 import java.lang.Iterable;
class Solution {


    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> que = new LinkedList<>();
        que.add(p);
        que.add(q);

        while(!que.isEmpty()){
            TreeNode ele1 = que.poll();
            TreeNode ele2 = que.poll();

            if(ele1 == null && ele2 == null) continue;

           else if(ele1 == null || ele2 == null || ele1.val != ele2.val) return false;


            que.add(ele1.left);
            que.add(ele2.left);
            que.add(ele1.right);
            que.add(ele2.right);
        }

        return true;
    }
}