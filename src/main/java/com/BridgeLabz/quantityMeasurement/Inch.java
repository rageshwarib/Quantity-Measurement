package com.BridgeLabz.quantityMeasurement;

import java.util.Objects;

public class Inch {
    private final double inchValue;

    public Inch(double value) {
        this.inchValue = value;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.inchValue, inchValue) == 0;
    }

}
