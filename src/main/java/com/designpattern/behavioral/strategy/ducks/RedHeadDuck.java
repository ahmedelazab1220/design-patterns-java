package com.designpattern.behavioral.strategy.ducks;

import com.designpattern.behavioral.strategy.behaviors.FlyNoWay;
import com.designpattern.behavioral.strategy.behaviors.FlyWithWings;
import com.designpattern.behavioral.strategy.behaviors.MuteQuack;
import com.designpattern.behavioral.strategy.behaviors.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    public static void main(String[] args) {
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        redHeadDuck.doFly();
        redHeadDuck.doQuack();

        System.out.println(redHeadDuck.display());
        redHeadDuck.swim();

        redHeadDuck.setFlyBehavior(new FlyNoWay());
        redHeadDuck.doFly();

        redHeadDuck.setQuackBehavior(new MuteQuack());
        redHeadDuck.doQuack();

    }

    @Override
    public String display() {
        return "I'm a real Red Headed duck";
    }

}
