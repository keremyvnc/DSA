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
    boolean solution=true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
        traverseBothTrees(p,q);
        return solution;

    }

    void traverseBothTrees(TreeNode p, TreeNode q){
        if(p == null && q != null) {
            solution = false;
            return;
        }
        else if(p != null && q == null){
            solution = false;
            return;
        }
        else if (p == null || q == null){
            return;
        }
        else if(p.val != q.val) {
            solution = false;
            return;
        }
        isSameTree(p.left, q.left);
        isSameTree(p.right, q.right);
    }
}