package com.BridgeLabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(length1, length2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(length1, length2);
    }
    @Test
    public void given0FeetAndNull_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Length length2 = null;
        Assert.assertNotEquals(length1, length2);
    }
    @Test
    public void givenTwoFeetWithDifferentType_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.FEET,0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(length1, feet2);
    }
    @Test
    public void givenTwoFeet_checkReference_shouldReturnNotEqual() {
        Feet2 feet1 = new Feet2(0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void givenEqualTwoFeetValues_checkValues_shouldReturnEqual() {
        Length length1 = new Length(Length.Unit.FEET,30.0);
        Length length2 = new Length(Length.Unit.FEET,30.0);
        Assert.assertEquals(length1, length2);
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Length length2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(length1, length2);
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Length length2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(length1, length2);
    }
    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Length length2 = null;
        Assert.assertNotEquals(length1, length2);
    }
    @Test
    public void givenTwoInchWithDifferentType_shouldReturnNotEqual() {
        Length length1 = new Length(Length.Unit.INCH,0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(length1 , inch2);
    }
    @Test
    public void givenTwoInch_checkReference_shouldReturnNotEqual() {
        Inch2 inch1 = new Inch2(0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(inch1 , inch2);
    }
    @Test
    public void givenEqualTwoInchValues_checkValues_shouldReturnEqual() {
        Length length1 = new Length(Length.Unit.INCH,30.0);
        Length length2 = new Length(Length.Unit.INCH,30.0);
        Assert.assertEquals(length1, length2);
    }
}
