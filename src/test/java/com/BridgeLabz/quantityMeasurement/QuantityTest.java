package com.BridgeLabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Length length = new Length();
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = new Length(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAndNull_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void givenTwoFeetWithDifferentType_shouldReturnNotEqual() {
        Length feet1 = new Length(Unit.FEET,0.0);
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
        Length feet1 = new Length(Unit.FEET,30.0);
        Length feet2 = new Length(Unit.FEET,30.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = new Length(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void givenTwoInchWithDifferentType_shouldReturnNotEqual() {
        Length inch1 = new Length(Unit.INCH,0.0);
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
        Length inch1 = new Length(Unit.INCH,30.0);
        Length inch2 = new Length(Unit.INCH,30.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH,0.0);
        Length feet = new Length(Unit.FEET,0.0);
        boolean compareCheck = length.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH,1.0);
        Length feet = new Length(Unit.FEET,1.0);
        boolean compareCheck = length.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH,1.0);
        Length feet = new Length(Unit.FEET,1.0);
        boolean compareCheck = length.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() {
        Length feet = new Length(Unit.FEET,1.0);
        Length inch = new Length(Unit.INCH,12.0);

        boolean compareCheck = length.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH,12.0);
        Length feet = new Length(Unit.FEET,1.0);
        boolean compareCheck = length.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() {
        Length feet = new Length(Unit.FEET,1.0);
        Length yard = new Length(Unit.YARD,1.0);
        boolean compareCheck = length.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() {
        Length feet = new Length(Unit.FEET,3.0);
        Length yard = new Length(Unit.YARD,1.0);
        boolean compareCheck = length.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() {
        Length inch = new Length(Unit.INCH,1.0);
        Length yard = new Length(Unit.YARD,1.0);
        boolean compareCheck = length.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() {
        Length yard = new Length(Unit.YARD,1.0);
        Length inch = new Length(Unit.INCH,36.0);
        boolean compareCheck = length.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5Cm_shouldReturnEqual() {
        Length inch = new Length(Unit.INCH,2.0);
        Length cm = new Length(Unit.CM,5.0);
        boolean compareCheck = length.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd2Inch_performAddition_shouldReturnResultInInch() {
        Length inch1 = new Length(Unit.INCH,2.0);
        Length inch2 = new Length(Unit.INCH,2.0);
        double addition = length.addition(inch1, inch2);
        Assert.assertEquals(4.0, addition,0.0);
    }
    @Test
    public void given1FeetAnd2Inch_performAddition_shouldReturnResultInInch() {
        Length feet = new Length(Unit.FEET,1.0);
        Length inch = new Length(Unit.INCH,2.0);
        double addition = length.addition(feet, inch);
        Assert.assertEquals(14.0, addition,0.0);
    }
}
