package com.lxb.draft.designPattern.observerPattern.rawObserverPattern;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
