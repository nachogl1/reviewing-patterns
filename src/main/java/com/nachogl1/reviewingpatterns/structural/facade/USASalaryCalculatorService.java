package com.nachogl1.reviewingpatterns.structural.facade;

public class USASalaryCalculatorService  {
    public static final String name = "USA";

    public int calculate() {
        System.out.println("Doing super difficult calculations for " + name + " salaries... wow");
        return 10000;
    }
}
