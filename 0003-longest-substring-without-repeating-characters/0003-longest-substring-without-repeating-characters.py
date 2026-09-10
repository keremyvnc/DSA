class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        leftPointer = 0
        longest = 0
        unique_set = set()

        for rightPointer in range(len(s)):
            while s[rightPointer] in unique_set:
                    unique_set.remove(s[leftPointer])
                    leftPointer +=1
            unique_set.add(s[rightPointer])
            longest = max(longest, len(unique_set))
        return longest



        