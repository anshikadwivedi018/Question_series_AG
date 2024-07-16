class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        int mini=prices[0];
        for(int i=0;i<prices.length;i++){
            int c=prices[i]-mini;
            prof=Math.max(c,prof);
            mini=Math.min(mini,prices[i]);
        }
        return prof;
    }
}