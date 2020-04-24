package com.BridgeLabz.quantityMeasurement;

public class QuantityException extends Exception  {
     ExceptionType type;

    public enum ExceptionType {
        UNEQUAL_QUANTITIES
    }

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
