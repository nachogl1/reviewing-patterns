package com.nachogl1.reviewingpatterns.behavioural.strategy.kata;

import com.nachogl1.reviewingpatterns.behavioural.strategy.kata.operationStrategies.MultiplyStrategy;
import com.nachogl1.reviewingpatterns.behavioural.strategy.kata.operationStrategies.SubtractStrategy;
import com.nachogl1.reviewingpatterns.behavioural.strategy.kata.operationStrategies.SumStrategy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CoolCalculatorShould {

    private CoolCalculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new CoolCalculator();
    }

    @Test
    void returnTwoWhenAddingOneAndOne(){
        int result = calculator.perform(new SumStrategy(), 1, 1);
        Assertions.assertEquals(result, 2);
    }

    @Test
    void returnOneWhenSubtractingOneToTwo(){
        int result = calculator.perform(new SubtractStrategy(), 2, 1);
        Assertions.assertEquals(result, 1);
    }

    @Test
    void returnTwoWhenMultiplyingTwoByTwo(){
        int result = calculator.perform(new MultiplyStrategy(), 2, 2);
        Assertions.assertEquals(result, 4);
    }
}
