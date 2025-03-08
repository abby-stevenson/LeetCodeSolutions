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

 // I think recursion would be best 
 // The best case would be when the node is a leaf and path equals the target sum 
 // Maybe use a queue that has pair entries where one is the node and the other is the path to that node because each node can only have one path to it 
 // If you find a path return true immediately 
 // if you reach all the leaves and havent returned true then return false
 class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        Queue<Pair<TreeNode, Integer>> queue = new LinkedList<Pair<TreeNode, Integer>>();
        queue.add(new Pair<>(root, 0));

        while (!queue.isEmpty()) {
            Pair<TreeNode, Integer> pair = queue.poll();
            TreeNode node = pair.getKey();
            int pathCost = pair.getValue();

            if (node.left == null && node.right == null) {
                if (pathCost + node.val == targetSum) {
                    return true;
                }
            }

            else {
                if (node.left != null) {
                    queue.add(new Pair<>(node.left, pathCost + node.val));
                }
                if (node.right != null) {
                    queue.add(new Pair<>(node.right, pathCost + node.val));
                }
            }
        }

        return false;
    }
}