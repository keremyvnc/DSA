class Solution(object):
    def searchMatrix(self, matrix, target):
        left=0
        right= len(matrix) * len(matrix[0]) - 1
        while left <= right:
            middle = (left + right) / 2
            row = middle / len(matrix[0])
            col = middle % len(matrix[0])
            if target == matrix[row][col]: return True
            elif target > matrix[row][col]:
                left = middle + 1
            else:
                right = middle - 1
        return False
                

        