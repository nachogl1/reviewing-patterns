package com.nachogl1.reviewingpatterns.structural.facade;

public class UKSalaryCalculatorService {
    public static final String name = "UK";

    public int calculate() {
        System.out.println("Doing super difficult calculations for " + name + " salaries... wow");
        return 100000;
    }
}
