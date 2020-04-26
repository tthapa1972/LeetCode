package com.fishercoder;

import com.fishercoder.solutions._1414;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _1414test {

    private static _1414.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _1414.Solution1();
    }

    @Test
    public void test1() {
        assertEquals(2, solution1.findMinFibonacciNumbers(7));
    }

    @Test
    public void test2() {
        assertEquals(2, solution1.findMinFibonacciNumbers(10));
    }

    @Test
    public void test3() {
        assertEquals(3, solution1.findMinFibonacciNumbers(19));
    }



}
