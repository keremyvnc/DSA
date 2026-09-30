"""
# Definition for a Node.
class Node:
    def __init__(self, val = 0, neighbors = None):
        self.val = val
        self.neighbors = neighbors if neighbors is not None else []
"""

from typing import Optional
class Solution:
    def cloneGraph(self, node: Optional['Node']) -> Optional['Node']:
        if node is None:
            return None
        clones = {}

        def dfs(dfs_node):
            if dfs_node in clones:
                return clones[dfs_node]

            new_node = Node(dfs_node.val)
            clones[dfs_node] = new_node

            for neighbor in dfs_node.neighbors:
                newNeighbor = dfs(neighbor)
                new_node.neighbors.append(newNeighbor)
            return new_node

        return dfs(node)