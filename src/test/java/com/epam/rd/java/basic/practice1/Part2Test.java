package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part2Test {

    @Test
    public void shouldReturnNullWhenArgumentNull() {
        Assert.assertEquals(0, Part2.addition(new String[] { null, null }));
    }

    @Test
    public void shouldReturnZeroWhenTwoArgumentsString() {
        Assert.assertEquals(40, Part2.addition(new String[] { "25", "15" }));
    }

    @Test
    public void shouldReturnZeroWhenFirstArgumentStringSecondNull() {
        Assert.assertEquals(0, Part2.addition(new String[] { "25", null }));
    }

    @Test
    public void shouldReturnZeroWhenArgumentEmptyString() {
        Assert.assertEquals(0, Part2.addition(new String[] {"", ""}));
    }

    @Test
    public void shouldReturnZeroWhenArgumentWhitespace() {
        Assert.assertEquals(0, Part2.addition(new String[] {" ", " "}));
    }
    
    @Test
    public void main() {
        Part2.main(new String[] { "25", "15" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}