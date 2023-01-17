package com.nachogl1.reviewingpatterns.behavioural.strategy.kata.operationStrategies;

public class MultiplyStrategy implements OperationStrategy {
    @Override
    public int execute(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
