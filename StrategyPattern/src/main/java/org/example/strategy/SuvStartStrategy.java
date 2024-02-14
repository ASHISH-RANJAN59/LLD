package org.example.strategy;

import org.example.strategy.StartStrategy;

public class SuvStartStrategy implements StartStrategy {


    @Override
    public void start() {
        System.out.println("SUV Started...");
    }
}
