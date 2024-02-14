package org.example.vehicle;

import org.example.constant.VehicleType;
import org.example.factory.StartStrategyFactory;

public class XUV700 extends Car {


    public XUV700(VehicleType vehicleType, StartStrategyFactory startStrategyFactory) {
        super(vehicleType, startStrategyFactory);
    }
}
