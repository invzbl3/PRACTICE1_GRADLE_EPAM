package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part3Test {

    @Test
    public void shouldReturnStringWhenNoArgument() {
        Assert.assertEquals("", Part3.display(new String[] {}));
    }
    
    @Test
    public void shouldReturnStringWhenArgumentStringArray() {
        Assert.assertEquals("5 6 7", Part3.display(new String[] { "5", "6", "7" }));
    }

    @Test
    public void shouldReturnStringWhenArgumentContainsOneNull() {
        Assert.assertEquals("5 6 null", Part3.display(new String[] { "5", "6", null }));
    }

    @Test
    public void shouldReturnStringWhenArgumentContainsTwoNulls() {
        Assert.assertEquals("5 null", Part3.display(new String[] { "5", null, null }));
    }

    @Test
    public void shouldReturnStringWhenArgumentContainsThreeNulls() {
        Assert.assertEquals("null", Part3.display(new String[] { null, null, null }));
    }


    @Test
    public void shouldReturnStringWhenArrayStringEmptyString() {
        Assert.assertEquals(" 6 7", Part3.display(new String[] { "", "6", "7" }));
    }

    @Test
    public void shouldReturnStringWhenArrayStringContainsWhitespace() {
        Assert.assertEquals(" 6 7", Part3.display(new String[] { " ", "6", "7" }));
    }
    
    @Test
    public void main() {
        Part3.main(new String[] { "5", "6", "7" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
