package com.lxb.draft.designPattern.strategyPattern;

public abstract class Duck {

    // 为行为接口类型声明两个引用变量

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {}

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    /* 委托给行为类 */

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
