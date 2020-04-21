package com.BridgeLabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1 , feet2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void given0FeetAndNull_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void givenTwoFeetWithDifferentType_shouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void givenTwoFeet_checkReference_shouldReturnNotEqual() {
        Feet2 feet1 = new Feet2(0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void givenEqualTwoFeetValues_checkValues_shouldReturnEqual() {
        Feet feet1 = new Feet(30.0);
        Feet feet2 = new Feet(30.0);
        Assert.assertEquals(feet1 , feet2);
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1 , inch2);
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1 , inch2);
    }
    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotEquals(inch1 , inch2);
    }
    @Test
    public void givenTwoInchWithDifferentType_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(inch1 , inch2);
    }
    @Test
    public void givenTwoInch_checkReference_shouldReturnNotEqual() {
        Inch2 inch1 = new Inch2(0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(inch1 , inch2);
    }
}
