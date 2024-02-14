package org.example;


import java.util.ArrayList;
import java.util.List;

public class Observable implements IObservable{

    private List<IObserver> observerList = new ArrayList<>();

    private String data;

    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.forEach(IObserver::publish);
    }

    public void setData(String data){
        this.data = data;
        notifyObserver();
    }

    public String getData(){
        return this.data;
    }

}
