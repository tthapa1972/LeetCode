package com.fishercoder.solutions;

public class _1414 {

    public static class Solution1 {

        public int findMinFibonacciNumbers(int k) {
            int prev1 = 1;
            int prev2 = 2;
            int num = 0;
            int x = 0;
            int res = 0;

            while (true) {
                num = prev1 + prev2;
                if (num > k) {
                    prev1 = prev2;
                    prev2 = num;
                    break;
                }

                prev1 = prev2;
                prev2 = num;
            }

            while (true) {
                if (k >= prev1) {
                    k -= prev1;
                    res++;
                }

                if (k == 0) {
                    break;
                } else {
                    x = prev2 - prev1;
                    prev2 = prev1;
                    prev1 = x;
                }
            }

            return res;
        }
    }
}
