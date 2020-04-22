package com.BridgeLabz.quantityMeasurement;

public enum Unit {
    FEET(12.0), INCH(1.0), YARD(36.0), CM(0.4);

    public final double baseUnitConversion;

    Unit(double baseUnitConversion){
        this.baseUnitConversion = baseUnitConversion;
    }

}
