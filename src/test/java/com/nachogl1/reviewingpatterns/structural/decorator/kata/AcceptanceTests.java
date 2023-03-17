package com.nachogl1.reviewingpatterns.structural.decorator.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptanceTests {

    @Test
    void givenClientWantsACoffee_WhenAskingForSpecialMilkAndSyrupShot_ThenCorrectPriceisUsed() {
        Drink drink = new BaseCoffee();

        drink = new CaramelSyrup(drink);
        drink = new OatMilk(drink);

        assertEquals(4, drink.getPrice());
    }

    @Test
    void givenClientWantsACoffee_WhenAskingForSpecialMilkAndSyrupShot_ThenCorrectNameIsUsed() {
        Drink drink = new BaseCoffee();

        drink = new CaramelSyrup(drink);
        drink = new OatMilk(drink);

        assertEquals("Coffee, Caramel Syrup shot, Oat Milk shot", drink.getDescription());
    }
}
