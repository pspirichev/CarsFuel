package com.example.user2.cars_fuel_android2.data_types;

import java.util.Calendar;

public class Car {
    private long        id;
    private String      make;
    private String      model;
    private short       year;
    private FuelType    fuelType;

    public Car(long id, String make, String model, short year, FuelType fuelType){
        this.id         = id;
        this.make       = make;
        this.model      = model;
        if (year >= 1887 && year <= Calendar.getInstance().get(Calendar.YEAR))
            this.year   = year;
        this.fuelType   = fuelType;
    }

    //Getters

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public short getYear() {
        return year;
    }

    public FuelType getFuel() {
        return fuelType;
    }
}
