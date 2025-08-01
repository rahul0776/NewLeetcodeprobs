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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(isSame(root,subRoot) == true){
            return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right, subRoot);

    }
    private boolean isSame(TreeNode r, TreeNode s){
        if(r == null && s == null){
            return true;
        }
        if(r==null ||s==null ||r.val!=s.val){
            return false;
        }
        return isSame(r.left,s.left) && isSame(r.right,s.right);
    }
}
