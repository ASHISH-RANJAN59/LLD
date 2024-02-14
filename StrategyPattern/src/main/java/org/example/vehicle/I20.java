package org.example.vehicle;

import org.example.constant.VehicleType;
import org.example.factory.StartStrategyFactory;

public class I20 extends Car{
    public I20(VehicleType vehicleType, StartStrategyFactory startStrategyFactory) {
        super(vehicleType, startStrategyFactory);
    }
}
