package org.example.strategy;

import org.example.strategy.StartStrategy;

public class SedanStartStrategy implements StartStrategy {

    @Override
    public void start() {
        System.out.println("Sedan Started...");
    }
}
