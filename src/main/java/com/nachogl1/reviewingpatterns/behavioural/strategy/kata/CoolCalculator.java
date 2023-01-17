package com.nachogl1.reviewingpatterns.behavioural.strategy.kata;

import com.nachogl1.reviewingpatterns.behavioural.strategy.kata.operationStrategies.OperationStrategy;

public class CoolCalculator {

    public int perform(OperationStrategy strategy, int firstNumber, int secondNumber) {
        return strategy.execute(firstNumber, secondNumber);
    }
}
