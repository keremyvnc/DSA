class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        leftPointer = 0
        rightPointer = 0
        longest = 0
        unique_set = set()
        while rightPointer < len(s):
            while s[rightPointer] in unique_set:
                    unique_set.remove(s[leftPointer])
                    leftPointer +=1
            unique_set.add(s[rightPointer])
            rightPointer += 1
            longest = max(longest, rightPointer - leftPointer)

        return longest



        