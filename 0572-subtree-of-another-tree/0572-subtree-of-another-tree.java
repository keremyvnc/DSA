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
    boolean solution = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        traverse(root, subRoot);
        return solution;
    }
    private void traverse(TreeNode root, TreeNode subRoot) {
        if(root == null) return;
        traverse(root.left, subRoot);
        traverse(root.right, subRoot);
        if(root.val == subRoot.val) {
            if(identical (root, subRoot)) solution = true;
        }
    }  
    private boolean identical(TreeNode root, TreeNode subRoot){
        if(root == null && subRoot == null) return true;
        if(root == null || subRoot == null) return false;
        if(root.val != subRoot.val) return false;
        return identical(root.left, subRoot.left) && identical(root.right, subRoot.right);
    }
}