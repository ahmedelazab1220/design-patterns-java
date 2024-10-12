package com.designpattern.behavioral.strategy.ducks;

import com.designpattern.behavioral.strategy.behaviors.FlyWithWings;
import com.designpattern.behavioral.strategy.behaviors.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        mallardDuck.doFly();
        mallardDuck.doQuack();

        System.out.println(mallardDuck.display());
        mallardDuck.swim();

    }

    @Override
    public String display() {
        return "I'm a real Mallard duck";
    }

}
