package com.pluralsight.finance;

public class House extends FixedAsset{
    // Data fields
    private int yearBuilt, squareFeet, bedrooms;

    // Constructor

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    // Methods
    @Override
    public double getValue(){
        return 0;
    }
}
