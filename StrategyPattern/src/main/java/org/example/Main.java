package org.example;

import org.example.constant.VehicleType;
import org.example.factory.StartStrategyFactory;
import org.example.vehicle.I20;
import org.example.vehicle.Verna;
import org.example.vehicle.XUV700;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StartStrategyFactory startStrategyFactory = new StartStrategyFactory();
        Verna verna = new Verna(VehicleType.SEDAN,startStrategyFactory);
        XUV700 xuv700 = new XUV700(VehicleType.SUV,startStrategyFactory);
        I20 i20 = new I20(VehicleType.HETCH_BACK,startStrategyFactory);
        verna.start();
        xuv700.start();
        i20.start();
    }
}