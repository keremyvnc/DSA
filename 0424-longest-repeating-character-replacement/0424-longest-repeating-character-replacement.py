class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        left = 0
        freq = {}

        max_length = 0
        
        for right in range(len(s)):
            right_val = s[right]
            if right_val in freq:
                freq[right_val] += 1
            else: freq[right_val] = 1

            while (right - left + 1) - max(freq.values()) > k:
                freq[s[left]] -= 1
                left += 1
            max_length = max((right - left + 1), max_length)
        return max_length

            




            

            
        