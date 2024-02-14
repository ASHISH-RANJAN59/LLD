package org.example;

import org.example.observable.Observable;
import org.example.observer.AppObserver;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Observable observable = new Observable();
        AppObserver appObserver = new AppObserver(observable);
        observable.register(appObserver);
        observable.setData("new data");
    }
}