package com.fishercoder.solutions;

public class _1416 {

    public static class Solution1 {

        public int numberOfArrays(String s, int k) {
            Integer[] dp = new Integer[s.length()];
            return (numberOfArrays(s, 0, k, dp));
        }

        public int numberOfArrays(String s, int i, int k, Integer[] dp) {

            if (i == s.length()) {
                return 1;
            }

            if (s.charAt(i) == '0') {
                return 0;
            }

            if (dp[i] != null) {
                return dp[i];
            }

            int ans = 0;

            long num = 0;

            for (int j = i; j < s.length(); j++) {
                num = num * 10 + s.charAt(j) - '0';
                if (num > k) {
                    break;
                }
                ans += numberOfArrays(s, j + 1, k, dp);
                ans %= 1000000007;
            }

            return dp[i] = ans;
        }
    }
}
