package com.lxb.draft.designPattern.strategyPattern;

// 绿头野鸭
public class MallardDuck extends Duck {

    // 绿头野鸭是会叫并且会飞的
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a MallardDuck!");
    }
}
