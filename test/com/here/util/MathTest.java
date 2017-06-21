package com.here.util;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 2017/6/19.
 */
public class MathsTest{
    @Test(testName = "结果为9")
    public void nine() throws Exception{
        assertEquals(9,new Maths().first(2));
    }
    @Test(testName = "结果为1")
    public void one() throws Exception{
        assertEquals(1,new Maths().first(-1));
    }
}
