package org.example.vehicle;

import org.example.constant.VehicleType;
import org.example.factory.StartStrategyFactory;
import org.example.strategy.StartStrategy;

public class Car {

    private final StartStrategy startStrategy;

    Car(VehicleType vehicleType, StartStrategyFactory startStrategyFactory){
        this.startStrategy = startStrategyFactory.getStartStrategy(vehicleType);
    }

    public void start(){
        startStrategy.start();
    }

}
