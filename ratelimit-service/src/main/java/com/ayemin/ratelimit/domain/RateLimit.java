package com.ayemin.ratelimit.domain;

import java.util.Objects;

public class RateLimit {
    private int requestPerUnit;
    private Unit unit;

    public RateLimit() {
    }

    public RateLimit(int requestPerUnit, Unit unit) {
        this.requestPerUnit = requestPerUnit;
        this.unit = unit;
    }

    public int getRequestPerUnit() {
        return requestPerUnit;
    }

    public void setRequestPerUnit(int requestPerUnit) {
        this.requestPerUnit = requestPerUnit;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RateLimit rateLimit = (RateLimit) o;
        return requestPerUnit == rateLimit.requestPerUnit && unit == rateLimit.unit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestPerUnit, unit);
    }
}
