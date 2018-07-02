package com.lxb.draft.designPattern.strategyPattern;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
