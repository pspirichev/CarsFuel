package com.example.user2.cars_fuel_android2.data_types;

import android.provider.Telephony;

import java.util.Date;

public class Refill {
    private long    id;
    private Date    date;
    private Volume  volume;
    private Cost    cost;
    private long    carID;

    public Refill(long id, Volume volume, Cost cost, long carID){
        this.id     = id;
        date        = new Date();
        this.volume = volume;
        this.cost   = cost;
        this.carID  = carID;
    }

    public Refill(long id, Volume volume, short cost, String currency,  long carID){
        this.id     = id;
        date        = new Date();
        this.volume = volume;
        this.cost   = new Cost(cost, currency);
        this.carID  = carID;
    }

    //Getters
    public long getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public long getDateMS(){
        return date.getTime();
    }

    public Volume getVolume() {
        return volume;
    }

    public Cost getCost() {
        return cost;
    }

    public long getCarID() {
        return carID;
    }
}
