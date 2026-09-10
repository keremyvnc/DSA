class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy = prices[0]
        max_profit = 0
        
        for price in prices:
            if price < buy:
                buy = price
            if price-buy > max_profit:
                max_profit = price - buy

        if max_profit <= 0:
            return 0
        else:
            return max_profit