class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        if(root.left == null && root.right == null) {
            return root;
        }

        else return new TreeNode(root.val, invertTree(root.right), invertTree(root.left));
        
    }
}