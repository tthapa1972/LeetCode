package com.fishercoder;

import com.fishercoder.solutions._1411;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1411test {

    private static _1411.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1411.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(54, solution1.numOfWays(2));
    }

    @Test
    public void test2() {
        assertEquals(246, solution1.numOfWays(3));
    }

    @Test
    public void test3() {
        assertEquals(106494, solution1.numOfWays(7));
    }

    @Test
    public void test4() {
        assertEquals(30228214, solution1.numOfWays(5000));
    }
}
