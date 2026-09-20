class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        rows = len(grid)
        cols = len(grid[0])
        
        def dfs(x : int, y: int):
            if x < 0 or y < 0 or x >= rows or y >= cols or grid[x][y] != '1':
                return
            else:
                grid[x][y] = '0'
                dfs(x-1,y)
                dfs(x+1,y)
                dfs(x,y-1)
                dfs(x,y+1)

        num_of_islands = 0
        for x in range(0, rows):
            for y in range(0, cols):
                if grid[x][y] == '1':
                    num_of_islands += 1
                    dfs(x, y)
        return num_of_islands