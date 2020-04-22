package com.fishercoder;

import com.fishercoder.solutions._1416;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1416Test {

    private static _1416.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1416.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(1, solution1.numberOfArrays("1000", 10000));
    }

    @Test
    public void test2() {
        assertEquals(0, solution1.numberOfArrays("1000", 10));
    }

    @Test
    public void test3() {
        assertEquals(8,  solution1.numberOfArrays("1317", 2000));
    }

    @Test
    public void test4() {
        assertEquals(1, solution1.numberOfArrays("2020", 30));
    }

    @Test
    public void test5() {
        assertEquals(34, solution1.numberOfArrays("1234567890", 90));
    }
}
