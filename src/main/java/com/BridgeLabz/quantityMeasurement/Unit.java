package com.BridgeLabz.quantityMeasurement;

public enum Unit {
    FEET(12.0, "Length"), INCH(1.0,"Length"), YARD(36.0, "Length"), CM(0.4, "Length"),
    GALLON(3.78,"Volume"), LITRE(1.0,"Volume"), MILLILITRE(0.001, "Volume"),
    TONNE(1000.0, "Weight"), KILOGRAM(1.0, "Weight"), GRAM(0.001, "Weight"),
    FAHRENHEIT(5.0 / 9.0, "Temperature"), CELSIUS(9.0 / 5.0, "Temperature");

    public final double baseUnitConversion;
    public final String quantityType;

    Unit(double baseUnitConversion, String quantityType){
        this.baseUnitConversion = baseUnitConversion;
        this.quantityType = quantityType;
    }

}
