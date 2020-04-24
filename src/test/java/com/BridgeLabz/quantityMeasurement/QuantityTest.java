package com.BridgeLabz.quantityMeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {
    Qunatity qunatity = new Qunatity();
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Qunatity feet1 = new Qunatity(Unit.FEET,0.0);
        Qunatity feet2 = new Qunatity(Unit.FEET,0.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAnd1Feet_shouldReturnNotEqual() {
        Qunatity feet1 = new Qunatity(Unit.FEET,0.0);
        Qunatity feet2 = new Qunatity(Unit.FEET,1.0);
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void given0FeetAndNull_shouldReturnNotEqual() {
        Qunatity feet1 = new Qunatity(Unit.FEET,0.0);
        Qunatity feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }
    @Test
    public void givenTwoFeetWithDifferentType_shouldReturnNotEqual() {
        Qunatity feet1 = new Qunatity(Unit.FEET,0.0);
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
        Qunatity feet1 = new Qunatity(Unit.FEET,30.0);
        Qunatity feet2 = new Qunatity(Unit.FEET,30.0);
        Assert.assertEquals(feet1, feet2);
    }
    @Test
    public void given0InchAnd0Inch_shouldReturnEqual() {
        Qunatity inch1 = new Qunatity(Unit.INCH,0.0);
        Qunatity inch2 = new Qunatity(Unit.INCH,0.0);
        Assert.assertEquals(inch1, inch2);
    }
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Qunatity inch1 = new Qunatity(Unit.INCH,0.0);
        Qunatity inch2 = new Qunatity(Unit.INCH,1.0);
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void given0InchAndNull_shouldReturnNotEqual() {
        Qunatity inch1 = new Qunatity(Unit.INCH,0.0);
        Qunatity inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }
    @Test
    public void givenTwoInchWithDifferentType_shouldReturnNotEqual() {
        Qunatity inch1 = new Qunatity(Unit.INCH,0.0);
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
        Qunatity inch1 = new Qunatity(Unit.INCH,30.0);
        Qunatity inch2 = new Qunatity(Unit.INCH,30.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void given0FeetAnd0Inch_shouldReturnEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,0.0);
        Qunatity feet = new Qunatity(Unit.FEET,0.0);
        boolean compareCheck = qunatity.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Inch_shouldReturnNotEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,1.0);
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        boolean compareCheck = qunatity.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1InchAnd1Feet_shouldReturnNotEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,1.0);
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        boolean compareCheck = qunatity.compare(feet, inch);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1FeetAnd12Inch_shouldReturnEqual() throws QuantityException {
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        Qunatity inch = new Qunatity(Unit.INCH,12.0);

        boolean compareCheck = qunatity.compare(feet, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given12InchAnd1Feet_shouldReturnEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,12.0);
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        boolean compareCheck = qunatity.compare(inch, feet);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1FeetAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        Qunatity yard = new Qunatity(Unit.YARD,1.0);
        boolean compareCheck = qunatity.compare(feet, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given3FeetAnd1Yard_shouldReturnEqual() throws QuantityException {
        Qunatity feet = new Qunatity(Unit.FEET,3.0);
        Qunatity yard = new Qunatity(Unit.YARD,1.0);
        boolean compareCheck = qunatity.compare(feet, yard);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given1InchAnd1Yard_shouldReturnNotEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,1.0);
        Qunatity yard = new Qunatity(Unit.YARD,1.0);
        boolean compareCheck = qunatity.compare(inch, yard);
        Assert.assertFalse(compareCheck);
    }
    @Test
    public void given1YardAnd36Inch_shouldReturnEqual() throws QuantityException {
        Qunatity yard = new Qunatity(Unit.YARD,1.0);
        Qunatity inch = new Qunatity(Unit.INCH,36.0);
        boolean compareCheck = qunatity.compare(yard, inch);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd5Cm_shouldReturnEqual() throws QuantityException {
        Qunatity inch = new Qunatity(Unit.INCH,2.0);
        Qunatity cm = new Qunatity(Unit.CM,5.0);
        boolean compareCheck = qunatity.compare(inch, cm);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void given2InchAnd2Inch_performAddition_shouldReturnResultInInch() {
        Qunatity inch1 = new Qunatity(Unit.INCH,2.0);
        Qunatity inch2 = new Qunatity(Unit.INCH,2.0);
        double addition = qunatity.addition(inch1, inch2);
        Assert.assertEquals(4.0, addition,0.0);
    }
    @Test
    public void given1FeetAnd2Inch_performAddition_shouldReturnResultInInch() {
        Qunatity feet = new Qunatity(Unit.FEET,1.0);
        Qunatity inch = new Qunatity(Unit.INCH,2.0);
        double addition = qunatity.addition(feet, inch);
        Assert.assertEquals(14.0, addition,0.0);
    }
    @Test
    public void given1FeetAnd1Feet_performAddition_shouldReturnResultInInch() {
        Qunatity feet1 = new Qunatity(Unit.FEET,1.0);
        Qunatity feet2 = new Qunatity(Unit.FEET,1.0);
        double addition = qunatity.addition(feet1, feet2);
        Assert.assertEquals(24.0, addition,0.0);
    }
    @Test
    public void given2InchAnd2Cm_performAddition_shouldReturnResultInInch() {
        Qunatity inch = new Qunatity(Unit.INCH,2.0);
        Qunatity cm = new Qunatity(Unit.CM,2.5);
        double addition = qunatity.addition(inch, cm);
        Assert.assertEquals(3.0, addition,0.0);
    }
    @Test
    public void givenGallonAndLitres_shouldReturnEqual() throws QuantityException {
        Qunatity gallon = new Qunatity(Unit.GALLON,1.0);
        Qunatity litre = new Qunatity(Unit.LITRE,3.78);
        boolean compareCheck = qunatity.compare(gallon, litre);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenLitreAndMillilitres_shouldReturnEqual() throws QuantityException {
        Qunatity litre = new Qunatity(Unit.LITRE,1.0);
        Qunatity ml = new Qunatity(Unit.MILLILITRE,1000.0);
        boolean compareCheck = qunatity.compare(litre, ml);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenGallonAndLitres_performAddition_shouldReturnResultInLitres() {
        Qunatity gallon = new Qunatity(Unit.GALLON,1.0);
        Qunatity litres = new Qunatity(Unit.LITRE,3.78);
        double addition = qunatity.addition(gallon, litres);
        Assert.assertEquals(7.57, addition,0.1);
    }
    @Test
    public void givenLitresAndMillilitres_performAddition_shouldReturnResultInLitres() {
        Qunatity litres = new Qunatity(Unit.LITRE,1.0);
        Qunatity ml = new Qunatity(Unit.MILLILITRE,1000.0);
        double addition = qunatity.addition(litres, ml);
        Assert.assertEquals(2.0, addition,0.0);
    }
    @Test
    public void givenKilogramAndGrams_shouldReturnEqual() throws QuantityException {
        Qunatity kg = new Qunatity(Unit.LITRE,1.0);
        Qunatity gm = new Qunatity(Unit.MILLILITRE,1000.0);
        boolean compareCheck = qunatity.compare(kg, gm);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenTonneAndKilograms_shouldReturnEqual() throws QuantityException {
        Qunatity tonne = new Qunatity(Unit.TONNE,1.0);
        Qunatity kg = new Qunatity(Unit.KILOGRAM,1000.0);
        boolean compareCheck = qunatity.compare(tonne, kg);
        Assert.assertTrue(compareCheck);
    }
    @Test
    public void givenTonneAndGrams_performAddition_shouldReturnResultInKg() {
        Qunatity tonne = new Qunatity(Unit.TONNE,1.0);
        Qunatity gm = new Qunatity(Unit.GRAM,1000.0);
        double addition = qunatity.addition(tonne, gm);
        Assert.assertEquals(1001.0, addition,0.0);
    }
    @Test
    public void givenFahrenheitAndCelsius_shouldReturnEqual() {
        Qunatity fahrenheit = new Qunatity(Unit.FAHRENHEIT,212.0);
        Qunatity celsius = new Qunatity(Unit.CELSIUS,100.0);
       double fahreHeitToCelcius = qunatity.temperatureConversion(fahrenheit, Unit.FAHRENHEIT);
        boolean compareCheck = qunatity.compareTemperature(fahreHeitToCelcius, celsius);
        Assert.assertTrue(compareCheck);
    }
}
