class Solution {
    public int numSquares(int n) {
        int[] dp= new int[n+1];
        for(int x =1; x <=n; ++x){
            int mv=x;
            int y=1, s=1;
            while(s<=x){
                mv = Math.min(mv, 1+dp[x-s]);
                y++;
                s=y*y;
            }
            dp[x] =mv;
        }
        return dp[n];
    }
}