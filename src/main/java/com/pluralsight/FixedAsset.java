package com.pluralsight;

public abstract class FixedAsset implements Valuable {
    // Data fields
    protected String name;
    protected double marketValue;

    //Methods
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();
}