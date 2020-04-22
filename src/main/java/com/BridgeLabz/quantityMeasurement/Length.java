package com.BridgeLabz.quantityMeasurement;

import java.util.Objects;

public class Length {
    private Unit unit;
    private double value;

    public Length() {
    }

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length length1, Length length2){
        return Double.compare(length1.value * length1.unit.baseUnitConversion,
                length2.value * length2.unit.baseUnitConversion) == 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 &&
                unit == length.unit;
    }
}
