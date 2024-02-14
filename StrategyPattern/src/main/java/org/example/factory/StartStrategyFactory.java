package org.example.factory;

import org.example.constant.VehicleType;
import org.example.strategy.DefaultStartStrategy;
import org.example.strategy.SedanStartStrategy;
import org.example.strategy.StartStrategy;
import org.example.strategy.SuvStartStrategy;

public class StartStrategyFactory {

    public StartStrategy getStartStrategy(VehicleType vehicleType){
        switch (vehicleType){
            case SUV :
                return new SuvStartStrategy();
            case SEDAN:
                return new SedanStartStrategy();
            default:
                return new DefaultStartStrategy();
        }
    }

}
