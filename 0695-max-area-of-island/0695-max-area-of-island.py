class Solution:
    def maxAreaOfIsland(self, grid: list[list[int]]) -> int:

        m, n = len(grid), len(grid[0])

        def dfs(x: int, y: int):
            if x < 0 or y < 0 or x >= m or y >= n or grid[x][y] == 0:
                return 0
            else:
                grid[x][y]=0
                return (1 + dfs(x-1, y) + dfs(x+1, y) + dfs(x, y-1) + dfs(x, y+1))
        
        maxArea = 0

        for x in range(0, m):
            for y in range(0, n):
                if grid[x][y] == 1:
                    maxArea = max(maxArea, dfs(x,y))

        return maxArea

        