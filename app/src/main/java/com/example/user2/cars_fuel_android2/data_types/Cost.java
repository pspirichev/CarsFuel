package com.example.user2.cars_fuel_android2.data_types;

public class Cost {
    private short   cost;
    private String  currency;

    public Cost(short cost, String currency){
        this.cost       = cost;
        this.currency   = currency;
    }

    public short getCost() {
        return cost;
    }

    public String getCurrency() {
        return currency;
    }
}
