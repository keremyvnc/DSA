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
        if self.validate(root, low, high):
            if high is not None:
                self.innerIsValidBST(root.left, low, min(high, root.val))
            else:
                self.innerIsValidBST(root.left, low, root.val)
            if low is not None:
                self.innerIsValidBST(root.right, max(low, root.val), high)
            else:
                self.innerIsValidBST(root.right, root.val, high)
        else:
            self.solution = False
            

    def validate(self, root: Optional[TreeNode], min, max) -> bool:
        if root is None: return True
        if min is not None and root.val <= min:
            return False
        if max is not None and root.val >= max:
            return False
        return True
                
                