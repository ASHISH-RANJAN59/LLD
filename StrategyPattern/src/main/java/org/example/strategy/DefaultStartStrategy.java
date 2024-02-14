package org.example.strategy;

public class DefaultStartStrategy implements StartStrategy{


    @Override
    public void start() {
        System.out.println("Car Started...");
    }
}
