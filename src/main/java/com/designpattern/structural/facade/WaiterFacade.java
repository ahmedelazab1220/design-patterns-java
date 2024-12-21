package com.designpattern.structural.facade;

import com.designpattern.structural.facade.sections.DessertSection;
import com.designpattern.structural.facade.sections.DrinkSection;
import com.designpattern.structural.facade.sections.MainDishSection;

public class WaiterFacade {

    private final MainDishSection mainDishSection;
    private final DessertSection dessertSection;
    private final DrinkSection drinkSection;

    public WaiterFacade() {
        this.mainDishSection = new MainDishSection();
        this.dessertSection = new DessertSection();
        this.drinkSection = new DrinkSection();
    }

    public WaiterFacade(MainDishSection mainDishSection, DessertSection dessertSection, DrinkSection drinkSection) {
        this.mainDishSection = mainDishSection;
        this.dessertSection = dessertSection;
        this.drinkSection = drinkSection;
    }

    public void serveFullMeal() {
        System.out.println("Waiter: We will start preparing the entire order...");
        mainDishSection.prepareMainDish();
        dessertSection.prepareDessert();
        drinkSection.prepareDrink();
        System.out.println("Waiter: The order is ready, enjoy your meal!");
    }
}
