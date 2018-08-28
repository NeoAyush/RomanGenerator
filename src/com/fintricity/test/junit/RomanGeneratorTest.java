package com.fintricity.test.junit;

import com.fintricity.test.RomanGenerator;
import junit.framework.AssertionFailedError;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class RomanGeneratorTest {

    RomanGenerator r = new RomanGenerator();

    @Test
    public void shouldReturnString() {

        String result = r.convertIntegerToRoman(123);
        Assert.assertTrue("Result is a string", result instanceof String);

    }

    @Test
    public void shouldPrintCorrectRomanValue() {
        String result = r.convertIntegerToRoman(100);
        Assert.assertEquals("C", result);
    }

    @Test
    public void shouldFailForNegativeNumber() {

        int inputNum = -100;
        String result = r.convertIntegerToRoman(inputNum);
        Assert.assertEquals("Conversion to Roman not possible", result);

    }

    @Test
    public void shouldFailForZero() {
        int inputNum = 0;
        String result = r.convertIntegerToRoman(inputNum);
        Assert.assertEquals("Conversion to Roman not possible", result);
    }

}
