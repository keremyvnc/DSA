class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int cheapest = prices[0];
        // keremyvnc
        for(int i=1; i<prices.length; i++) {
            if(prices[i]-cheapest > maxProfit) maxProfit = prices[i]- cheapest;
            if(prices[i]<cheapest) cheapest = prices[i];
        }
        return maxProfit;
    }
}