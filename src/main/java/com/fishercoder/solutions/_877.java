package com.fishercoder.solutions;

public class _877 {
    public static class Solution1 {
        public boolean stoneGame(int[] piles) {
            int n = piles.length;
            int [][]dp = new int[n][n];

            return(dfs(0, n - 1, piles, dp) > 0);
        }

        public int dfs(int l, int r, int []piles, int [][]dp){

            if(dp[l][r] != 0){
                return dp[l][r];
            }

            if(l > r){
                return 0;
            }

            if(l==r){
                return piles[l];
            }

            int left = piles[l] - dfs(l+1, r, piles, dp);

            int right = piles[r] - dfs(l, r-1, piles, dp);

            return(dp[l][r] = Math.max(left, right));
        }
    }
}
