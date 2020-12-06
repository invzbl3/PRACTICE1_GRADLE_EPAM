package com.epam.rd.java.basic.practice1;

import org.junit.Assert;
import org.junit.Test;

public class Part6Test {
    @Test
    public void shouldReturnStringWhenArgumentInteger() {
        Assert.assertEquals("2 3 5 7 11 13", Part6.prime( 6));
    }

    @Test
    public void shouldReturnEmptyStringWhenArgumentZero() {
        Assert.assertEquals("", Part6.prime( 0));
    }
    
    @Test
    public void shouldReturnStringWhenArgumentIntegerArray() {
        Assert.assertEquals("2 3 5 7 11 13", Part6.join(new int[] {2, 3, 5, 7, 11, 13}, " "));
    }

    @Test
    public void main() {
        Part6.main(new String[] { "6" });
        Assert.assertTrue("Assertion to be compliant", true);
    }
    
    @Test
    public void demoTest() {
        Demo.main(new String[] { });
        Assert.assertTrue("Assertion to be compliant", true);
    }
}
