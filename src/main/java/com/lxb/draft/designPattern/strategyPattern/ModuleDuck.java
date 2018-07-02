package com.lxb.draft.designPattern.strategyPattern;

public class ModuleDuck extends Duck {

    public ModuleDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a ModuleDuck!");
    }
}
