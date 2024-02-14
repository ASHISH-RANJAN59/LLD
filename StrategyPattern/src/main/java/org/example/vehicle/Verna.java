package org.example.vehicle;

import org.example.constant.VehicleType;
import org.example.factory.StartStrategyFactory;

public class Verna extends Car {

    public Verna(VehicleType vehicleType, StartStrategyFactory startStrategyFactory) {
        super(vehicleType, startStrategyFactory);
    }
}
