# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    solution = True
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        return self.innerIsValidBST(root, float("-inf"), float("inf"))

    def innerIsValidBST(self, root: Optional[TreeNode], low, high):
        if root == None: return True
        if low >= root.val or root.val >= high: return False
        return self.innerIsValidBST(root.left, low, min(high, root.val)) and self.innerIsValidBST(root.right, max(low, root.val), high)
        
                
                