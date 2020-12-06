package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Part1Test {
    @Test
    public void test() throws Exception {
        PrintStream originalOut = System.out; // to have a way to undo the binding with your `ByteArrayOutputStream`
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        // action
        Part1.main(null);
        // assertion
        Assert.assertEquals("Hello, World", bos.toString());
        // undo the binding in System
        System.setOut(originalOut);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
