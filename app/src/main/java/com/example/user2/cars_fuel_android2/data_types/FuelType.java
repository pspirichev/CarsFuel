package com.example.user2.cars_fuel_android2.data_types;

public class FuelType {
    private short type;

    public FuelType(short type){
        if (type >= 0 && type <= 9)
            this.type = type;
    }

    //Getters
    public short getType() {
        return type;
    }
}
