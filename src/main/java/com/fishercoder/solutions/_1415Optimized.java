package com.fishercoder.solutions;

import java.util.HashMap;
import java.util.Map;

public class _1415Optimized {

    public static class Solution1 {
        public String getHappyString(int n, int k) {

            if(k==0 || k > ((int)3 * (Math.pow(2, n-1)))){
                return "";
            }

            Map<Character, char[]> map = new HashMap<>();

            map.put(' ', new char[]{'a','b','c'});
            map.put('a', new char[]{'b','c'});
            map.put('b', new char[]{'a','c'});
            map.put('c', new char[]{'a','b'});

            char prev = ' ';

            k--;

            StringBuffer sb = new StringBuffer("");

            while(n > 1){
                int nextAmount = (int)Math.pow(2, n-1);
                int rank = k / nextAmount;

                sb.append(map.get(prev)[rank]);
                prev = map.get(prev)[rank];
                k = k % nextAmount;
                n--;

            }

            sb.append(map.get(prev)[k]);

            return(sb.toString());

        }
    }
}
