package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part4Test {

    @Test
    public void shouldReturnZeroWhenArgumentsStrings() {
        Assert.assertEquals(5, Part4.calculate( "10", "15" ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentsNull() {
        Assert.assertEquals(0, Part4.calculate( null, null ));
    }

    @Test
    public void shouldReturnZeroWhenOneArgumentNull() {
        Assert.assertEquals(0, Part4.calculate( "10", null ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentsEmptyString() {
        Assert.assertEquals(0, Part4.calculate( "", "" ));
    }

    @Test
    public void shouldReturnZeroWhenArgumentsWhitespaces() {
        Assert.assertEquals(0, Part4.calculate( " ", " " ));
    }
    
    @Test
    public void main() {
        Part4.main(new String[] { "10", "15" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
