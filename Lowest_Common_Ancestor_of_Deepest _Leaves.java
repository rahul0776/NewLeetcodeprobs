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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return helper(root);
    }
    public TreeNode helper(TreeNode root){
        if(root == null) return null;

        if(root.left == null && root.right == null){
            return root;
        }
        if(height(root.left)>height(root.right)){
            return helper(root.left);
        }
        else if(height(root.left)<height(root.right)){
            return helper(root.right);
        }
        else return root;
    }
    public int height(TreeNode root){
        if(root == null) return 0;
        if(root.left == null && root.right == null){
            return 1;
        }
        return 1+ Math.max(height(root.left),height(root.right));
    }
}
