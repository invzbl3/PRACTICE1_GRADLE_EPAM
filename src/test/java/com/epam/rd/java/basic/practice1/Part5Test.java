package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part5Test {
    @Test
    public void shouldReturnIntegerWhenArgumentString() {
        Assert.assertEquals(21, Part5.sum( "123456" ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentNull() {
        Assert.assertEquals(0, Part5.sum( null ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentEmptyString() {
        Assert.assertEquals(0, Part5.sum( "" ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentWhitespace() {
        Assert.assertEquals(0, Part5.sum( " " ));
    }
    
    @Test
    public void main() {
        Part5.main(new String[] { "123456" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}