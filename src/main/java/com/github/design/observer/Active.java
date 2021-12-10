package com.github.design.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Active {

    final List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public abstract void act(Object obj);
}
