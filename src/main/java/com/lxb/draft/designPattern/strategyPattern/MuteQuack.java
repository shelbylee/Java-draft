package com.lxb.draft.designPattern.strategyPattern;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
