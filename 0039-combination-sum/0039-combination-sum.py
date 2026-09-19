class Solution:
    def combinationSum(self, candidates: list[int], target: int) -> list[list[int]]:
        combinations = []
        def backtrack(start_index: int, elements: list[int], remaining: int):
            for start_index  in range(start_index, len(candidates)):
                c = candidates[start_index]
                if c > remaining:
                    continue
                elif  remaining == c:
                    elements.append(c)
                    combinations.append(elements[:])
                    elements.pop()
                else:
                    elements.append(c)
                    backtrack(start_index, elements, remaining - c)
                    elements.pop()
        backtrack(0, [], target)
        return combinations