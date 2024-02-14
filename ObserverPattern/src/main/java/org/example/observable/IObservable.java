package org.example.observable;

import org.example.observer.IObserver;

public interface IObservable {

    void register (IObserver observer);

    void notifyObserver();

}
