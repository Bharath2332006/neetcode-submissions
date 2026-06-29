class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min=prices[0],max=prices[0];
        for(int i=1;i<prices.length;i++){
            //profit=Math.max(profit,max-min);
            if(prices[i]<min && i<prices.length-1 ){
                min=prices[i];
                max=prices[i];   
            }
            else if(prices[i]>max) {
                max=prices[i];
            }
            profit=Math.max(profit,max-min);
        }
        return profit;
        
    }
}
