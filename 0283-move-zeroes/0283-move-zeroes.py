class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        last_zero = 0
        for p in range(0, len(nums)):
            while last_zero < len(nums) - 1 and nums[last_zero] is not 0:
                last_zero += 1
            if last_zero < p:                
                nums[last_zero] = nums[p]
                nums[p] = 0

        