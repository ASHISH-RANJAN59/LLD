package org.example;

public class AppObserver implements IObserver{

    private Observable observable;

    AppObserver(Observable observable){
        this.observable = observable;
    }

    @Override
    public void publish() {
        System.out.println("New data arrived");
        System.out.println(observable.getData());
    }
}
