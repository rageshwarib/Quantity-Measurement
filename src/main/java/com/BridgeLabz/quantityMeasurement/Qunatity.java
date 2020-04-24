package com.BridgeLabz.quantityMeasurement;

public class Qunatity {
    private Unit unit;
    private double value;

    public Qunatity() {
    }

    public Qunatity(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Qunatity qunatity1, Qunatity qunatity2){
        return Double.compare(qunatity1.value * qunatity1.unit.baseUnitConversion,
                qunatity2.value * qunatity2.unit.baseUnitConversion) == 0;
    }
    public double addition(Qunatity qunatity1, Qunatity qunatity2) {
        return qunatity1.value * qunatity1.unit.baseUnitConversion +
                qunatity2.value * qunatity2.unit.baseUnitConversion;

    }

    public double temperatureConversion(Qunatity quantity, Unit unit) {
        switch (unit) {
            case FAHRENHEIT:
              return (quantity.value - 32) * (unit.baseUnitConversion);
              case CELSIUS:
                return ((quantity.value * (unit.baseUnitConversion)) + 32);
        }
       return quantity.value;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Qunatity qunatity = (Qunatity) o;
        return Double.compare(qunatity.value, value) == 0 &&
                unit == qunatity.unit;
    }

}
