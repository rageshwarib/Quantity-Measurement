package com.BridgeLabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = new Length(Length.Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAndNull_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void givenTwoFeetWithDifferentType_shouldReturnNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET,0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void givenTwoFeet_checkReference_shouldReturnNotEqual() {
        Feet2 feet1 = new Feet2(0.0);
        Feet2 feet2 = new Feet2(0.0);
        Assert.assertNotEquals(feet1 , feet2);
    }
    @Test
    public void givenEqualTwoFeetValues_checkValues_shouldReturnEqual() {
        Length feet1 = new Length(Length.Unit.FEET,30.0);
        Length feet2 = new Length(Length.Unit.FEET,30.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = new Length(Length.Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void givenTwoInchWithDifferentType_shouldReturnNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH,0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void givenTwoInch_checkReference_shouldReturnNotEqual() {
        Inch2 inch1 = new Inch2(0.0);
        Inch2 inch2 = new Inch2(0.0);
        Assert.assertNotEquals(inch1 , inch2);
    }
    @Test
    public void givenEqualTwoInchValues_checkValues_shouldReturnEqual() {
        Length inch1 = new Length(Length.Unit.INCH,30.0);
        Length inch2 = new Length(Length.Unit.INCH,30.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH,0.0);
        Length feet = new Length(Length.Unit.FEET,0.0);
        boolean compareCheck = feet.comapre(inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH,1.0);
        Length feet = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet.comapre(inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length inch = new Length(Length.Unit.INCH,1.0);
        Length feet = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = feet.comapre(inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length feet = new Length(Length.Unit.FEET,1.0);
        Length inch = new Length(Length.Unit.INCH,12.0);
        boolean compareCheck = feet.comapre(inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length inch = new Length(Length.Unit.INCH,12.0);
        Length feet = new Length(Length.Unit.FEET,1.0);
        boolean compareCheck = inch.comapre(feet);
        Assert.assertTrue(compareCheck);
    }
}
