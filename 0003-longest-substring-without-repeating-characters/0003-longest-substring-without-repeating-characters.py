class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        leftPointer = 0
        rightPointer = 0
        longest = 0
        unique_length = 0
        unique_set = set()

        while rightPointer < len(s):
            if s[rightPointer] not in unique_set:
                unique_set.add(s[rightPointer])
                rightPointer += 1
                unique_length += 1
                longest = max(longest, unique_length)
            else:
                while s[rightPointer] in unique_set:
                    unique_set.discard(s[leftPointer])
                    leftPointer +=1
                    unique_length -= 1
        return longest



        