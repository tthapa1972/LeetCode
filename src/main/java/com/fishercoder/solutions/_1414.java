package com.fishercoder.solutions;

/*
*
* Given the number k, return the minimum number of Fibonacci numbers whose sum is equal to k, whether a Fibonacci number could be used multiple times.

The Fibonacci numbers are defined as:

F1 = 1
F2 = 1
Fn = Fn-1 + Fn-2 , for n > 2.
It is guaranteed that for the given constraints we can always find such fibonacci numbers that sum k.


Example 1:

Input: k = 7
Output: 2
Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ...
For k = 7 we can use 2 + 5 = 7.
Example 2:

Input: k = 10
Output: 2
Explanation: For k = 10 we can use 2 + 8 = 10.
Example 3:

Input: k = 19
Output: 3
Explanation: For k = 19 we can use 1 + 5 + 13 = 19.


Constraints:

1 <= k <= 10^9
* */

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
