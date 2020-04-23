package com.BridgeLabz.quantityMeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4),
    GALLON(3780.0), LITRE(1000.0), MILLILITRE(1.0);

    public final double baseUnitConversion;

    Unit(double baseUnitConversion){
        this.baseUnitConversion = baseUnitConversion;
    }

}
