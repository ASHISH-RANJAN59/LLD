package org.example;

import org.example.strategy.StartStrategy;

public class Car {

    private final StartStrategy strategy;

    Car(StartStrategy strategy){
        this.strategy = strategy;
    }

    void start(){
        strategy.start();
    }

}
