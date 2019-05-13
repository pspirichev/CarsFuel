package com.example.user2.cars_fuel_android2.data_types;

public class Volume {
    private short   litres;

    public Volume(short volume, int measure){
        switch (measure) {
            case 0:
                litres = volume;
                break;
            case 1:
                litres = (short) Math.round(0.264172 * volume);
                break;
        }
    }

    public short getVolume(int measure){
        switch (measure) {
            case 0:
                return litres;
            case 1:
                return (short) Math.round(litres / 0.264172);
        }

        return 0;
    }
}
