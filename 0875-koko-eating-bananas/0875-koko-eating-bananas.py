class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        upperBound = max(piles)
        lowerBound = 1
        while lowerBound < upperBound:
            newBound = (upperBound + lowerBound) // 2
            hour = 0
            for pile in piles:
                hour += -(-pile // newBound)
            if hour <= h:
                upperBound = newBound
            else:
                lowerBound = newBound + 1
        return upperBound