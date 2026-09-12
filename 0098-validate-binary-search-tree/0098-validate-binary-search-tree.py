# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    solution = True
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        self.innerIsValidBST(root, float("-inf"), float("inf"))
        return self.solution

    def innerIsValidBST(self, root: Optional[TreeNode], low, high):
        if root == None: return
        if low < root.val < high:
            self.innerIsValidBST(root.left, low, min(high, root.val))
            self.innerIsValidBST(root.right, max(low, root.val), high)
        else:
            self.solution = False
                
                