package com.lxb.draft.designPattern.strategyPattern;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("www~ I cannot fly!");
    }
}
