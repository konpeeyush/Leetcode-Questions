class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1] ;
        Arrays.fill(dp,-1);
        int ans=helper(coins,amount,dp);
        if(ans==Integer.MAX_VALUE){
            return -1 ;
        }
        return ans ;
    }
    private int helper(int[] coins, int amount,int[]dp){
        if(amount==0) 
            return 0 ;
        if(amount<0)
            return Integer.MAX_VALUE ;
        if(dp[amount]!=-1){
            return dp[amount] ;
        }
        
        int minimum=Integer.MAX_VALUE ;
        for(int i=0;i<coins.length;i++){
            int ans=helper(coins,amount-coins[i],dp) ;
            if(ans!=Integer.MAX_VALUE){
                minimum=Math.min(minimum,ans+1) ;
            }
        }
        dp[amount]=minimum ;
        return minimum ;
    }
}