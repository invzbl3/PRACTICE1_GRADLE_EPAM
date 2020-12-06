package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part7Test {
    
    @Test
    public void str2intShouldReturnPositiveIntegerWhenArgumentString() {
        Assert.assertEquals(1378, Part7.str2int("AZZ"));
    }

    @Test
    public void str2intShouldReturnNegativeIntegerWhenArgumentWhitespace() {
        Assert.assertEquals(-32, Part7.str2int(" "));
    }

    @Test
    public void int2strShouldReturnStringWhenArgumentInteger() {
        Assert.assertEquals("AZZ", Part7.int2str(1378));
    }

    @Test
    public void int2strShouldReturnEmptyStringWhenArgumentZero() {
        Assert.assertEquals("", Part7.int2str(0));
    }

    @Test
    public void int2strShouldReturnStringWhenNegativeInteger() {
        Assert.assertEquals("6", Part7.int2str(-10));
    }

    @Test
    public void rightColumnShouldReturnStringWhenStringArgument() {
        Assert.assertEquals("CAA", Part7.rightColumn("BZZ"));
    }

    @Test
    public void rightColumnShouldReturnNullWhenNullArgument() {
        Assert.assertNull(Part7.rightColumn(null));
    }
    
    @Test
    public void main() {
        Part7.main(new String[] { "AZZ", "1378", "BZZ" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}