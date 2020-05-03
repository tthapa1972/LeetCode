package com.fishercoder;

import com.fishercoder.solutions._877;
import com.fishercoder.solutions._877bottomup;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class _877bottomUpTest {

    private static _877bottomup.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _877bottomup.Solution1();
    }

    @Test
    public void test1() {
        assertTrue(solution1.stoneGame(new int[]{5,3,4,5}));
    }
}
