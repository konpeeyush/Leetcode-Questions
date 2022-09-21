class Solution {
    public int minDistance(String s1, String s2) {
        int n=s1.length() ;
        int m=s2.length() ;
        return fun(s1,s2,n,m) ;
    }
    static int fun(String s1,String s2,int n,int m){
        int[][]dp=new int[n+1][m+1] ;
        for(int i=0;i<dp.length;i++){
            dp[i][0]=i ;
        }
        for(int j=0;j<dp[0].length;j++){
            dp[0][j]=j ;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1] ;
                }
                else{
                    dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]) ;
                }
            }
        }
        return dp[n][m] ;
    }
}