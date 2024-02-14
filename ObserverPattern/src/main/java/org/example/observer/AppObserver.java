package org.example.observer;

import org.example.observable.Observable;

public class AppObserver implements IObserver {

    private Observable observable;

    public AppObserver(Observable observable){
        this.observable = observable;
    }

    @Override
    public void publish() {
        System.out.println("New data arrived");
        System.out.println(observable.getData());
    }
}
