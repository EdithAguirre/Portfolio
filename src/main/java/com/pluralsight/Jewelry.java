package com.pluralsight;

public class Jewelry extends FixedAsset{
    // Data fields
    private double karat;

    // Constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    // Methods
    @Override
    public double getValue(){
        return 0;
    }
}
