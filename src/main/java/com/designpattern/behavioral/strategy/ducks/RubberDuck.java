package com.designpattern.behavioral.strategy.ducks;

import com.designpattern.behavioral.strategy.behaviors.FlyNoWay;
import com.designpattern.behavioral.strategy.behaviors.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck();

        rubberDuck.doFly();
        rubberDuck.doQuack();

        System.out.println(rubberDuck.display());
        rubberDuck.swim();

    }

    @Override
    public String display() {
        return "I'm RubberDuck";
    }
}
