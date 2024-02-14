package org.example;

public interface IObservable {

    void register (IObserver observer);

    void notifyObserver();

}
