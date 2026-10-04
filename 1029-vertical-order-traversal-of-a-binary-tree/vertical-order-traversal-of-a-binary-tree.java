import java.util.*;

class Tuple {
    TreeNode node;
    int row;
    int col;

    Tuple(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
            = new TreeMap<>();

        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {

            Tuple tuple = q.poll();

            TreeNode node = tuple.node;
            int row = tuple.row;
            int col = tuple.col;

            // Create column
            if (!map.containsKey(col)) {
                map.put(col, new TreeMap<>());
            }

            // Create row
            if (!map.get(col).containsKey(row)) {
                map.get(col).put(row, new PriorityQueue<>());
            }

            // Store node value
            map.get(col).get(row).offer(node.val);

            // Left child
            if (node.left != null) {
                q.offer(new Tuple(
                    node.left,
                    row + 1,
                    col - 1
                ));
            }

            // Right child
            if (node.right != null) {
                q.offer(new Tuple(
                    node.right,
                    row + 1,
                    col + 1
                ));
            }
        }

        List<List<Integer>> answer = new ArrayList<>();

        // Traverse columns from left to right
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

            List<Integer> column = new ArrayList<>();

            // Traverse rows from top to bottom
            for (PriorityQueue<Integer> pq : rows.values()) {

                // Values at same row and column
                // come in increasing order
                while (!pq.isEmpty()) {
                    column.add(pq.poll());
                }
            }

            answer.add(column);
        }

        return answer;
    }
}