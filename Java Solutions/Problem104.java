class Solution {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        else if (root.left == null && root.right != null){
            return (this.maxDepth(root.right) + 1);
        }

         else if (root.left != null && root.right == null){
            return this.maxDepth(root.left) + 1;
        }

        else {
            return Math.max(this.maxDepth(root.left) + 1, this.maxDepth(root.right) + 1);
        }
        
    }
}