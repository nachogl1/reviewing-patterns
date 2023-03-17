package com.nachogl1.reviewingpatterns.structural.facade.example;

public class SpainSalaryCalculatorService {
    public static final String name = "SPAIN";

    public int calculate() {
        System.out.println("Doing super difficult calculations for " + name + " salaries... wow");
        return 100000908;
    }
}
