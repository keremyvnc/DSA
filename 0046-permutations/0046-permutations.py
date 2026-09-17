class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]:
        result: list[list[int]] = []

        def innerPermute(seen: set[int], p: list[int], nums: list[int]):
            if len(seen) == len(nums):
                result.append(p[:])
                return

            for num in nums:
                if num in seen:
                    continue
                seen.add(num)
                p.append(num)
                innerPermute(seen, p, nums)
                seen.remove(num)
                p.pop()
        innerPermute(set(), [], nums)

        return result