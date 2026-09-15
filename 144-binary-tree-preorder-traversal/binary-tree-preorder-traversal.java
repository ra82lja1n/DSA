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
    public List<Integer> preorderTraversal(TreeNode root) {

        Stack<TreeNode> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        st.add(root);

        while(!st.isEmpty()){
            TreeNode temp = st.pop();
            if(temp == null) continue;
            list.add(temp.val);
            st.add(temp.right);
            st.add(temp.left);
        }


        return list;

    }
}