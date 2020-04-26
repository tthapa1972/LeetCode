package com.fishercoder;

import com.fishercoder.solutions._1415;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1415OptimizedTest {

    private static _1415.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1415.Solution1();
    }

    @Test
    public void test1() {
        assertEquals("cab", solution1.getHappyString(3, 9));
    }

    @Test
    public void test2() {
        assertEquals("", solution1.getHappyString(1, 4));
    }

    @Test
    public void test3() {
        assertEquals("c", solution1.getHappyString(1, 3));
    }

    @Test
    public void test4() {
        assertEquals("", solution1.getHappyString(2, 7));
    }

    @Test
    public void test5() {
        assertEquals("abacbabacb", solution1.getHappyString(10, 100));
    }

}
