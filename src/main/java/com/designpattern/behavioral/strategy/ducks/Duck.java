package com.designpattern.behavioral.strategy.ducks;

import com.designpattern.behavioral.strategy.behaviors.FlyBehavior;
import com.designpattern.behavioral.strategy.behaviors.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    void doFly() {
        flyBehavior.fly();
    }

    void doQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract String display();

}
