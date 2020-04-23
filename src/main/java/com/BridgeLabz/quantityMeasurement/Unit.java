package com.BridgeLabz.quantityMeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4),
    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001),
    TONNE(1000.0), KILOGRAM(1.0), GRAM(0.001);

    public final double baseUnitConversion;

    Unit(double baseUnitConversion){
        this.baseUnitConversion = baseUnitConversion;
    }

}
