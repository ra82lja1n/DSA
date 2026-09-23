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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qq = new LinkedList<>();

        if(root == null) return ans;

        qq.offer(root);

        while(!qq.isEmpty()){
            int size = qq.size();
            List<Integer> list = new ArrayList<>();
            while(size --> 0){
                TreeNode temp = qq.poll();
                if(temp.left != null) qq.offer(temp.left);
                if(temp.right != null) qq.offer(temp.right);

                list.add(temp.val);
            }

            ans.add(list);
        }
        
        return ans;
    }
}