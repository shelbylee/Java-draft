package com.lxb.draft.designPattern.strategyPattern;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly~");
    }
}
