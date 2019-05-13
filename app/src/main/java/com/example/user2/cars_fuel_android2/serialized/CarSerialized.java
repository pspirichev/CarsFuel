package com.example.user2.cars_fuel_android2.serialized;

import com.example.user2.cars_fuel_android2.data_types.Car;
import com.example.user2.cars_fuel_android2.data_types.FuelType;

import java.util.Date;

public class CarSerialized {
    private long        car_id;
    private String      make,
                        model;
    private short       year,
                        fuelType; //При экспорте должно быть переделано в Fuel

    public CarSerialized(Car car){
        this.car_id     = car.getId();
        this.make       = car.getMake();
        this.model      = car.getModel();
        this.year       = car.getYear();
        this.fuelType   = car.getFuel().getType();
    }

    public Car deserialize(){
        return new Car(this.car_id, this.make, this.model, this.year, new FuelType(fuelType));
    }
}
