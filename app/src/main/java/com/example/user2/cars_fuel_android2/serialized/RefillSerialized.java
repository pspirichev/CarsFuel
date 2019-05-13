package com.example.user2.cars_fuel_android2.serialized;

import com.example.user2.cars_fuel_android2.data_types.Cost;
import com.example.user2.cars_fuel_android2.data_types.Refill;
import com.example.user2.cars_fuel_android2.data_types.Volume;

public class RefillSerialized {
    private long    refill_id,
                    date,
                    car_id;
    private short   volume,
                    cost;
    private String  currency;

    public RefillSerialized(Refill refill){
        this.refill_id  = refill.getId();
        this.date       = refill.getDateMS();
        this.volume     = refill.getVolume().getVolume(0);
        this.cost       = refill.getCost().getCost();
        this.currency   = refill.getCost().getCurrency();
        this.car_id     = refill.getCarID();
    }

    public Refill unserialize(){
        return new Refill(this.refill_id, new Volume(this.volume, 0), new Cost(this.cost, this.currency), this.car_id);
    }
}
