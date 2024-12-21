package com.designpattern.structural.facade;

public class Restaurant {
    public static void main(String[] args) {
        WaiterFacade waiter = new WaiterFacade();
        waiter.serveFullMeal();
    }
}
