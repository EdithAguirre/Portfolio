package com.pluralsight.finance;

public class Gold extends FixedAsset{
    // Data fields
    private double weight;

    //Constructor

    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // Methods
    @Override
    public double getValue(){
        return 0;
    }
}
