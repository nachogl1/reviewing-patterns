package com.nachogl1.reviewingpatterns.structural.facade;

public class SalaryCalculatorFacade {

    private final USASalaryCalculatorService usaSalaryCalculatorService = new USASalaryCalculatorService();
    private final SpainSalaryCalculatorService spainSalaryCalculatorService = new SpainSalaryCalculatorService();
    private final UKSalaryCalculatorService ukSalaryCalculatorService = new UKSalaryCalculatorService();

    public int calculateSalaryForUk() {
        return this.ukSalaryCalculatorService.calculate();
    }

    public int calculateSalaryForSpain() {
        return this.spainSalaryCalculatorService.calculate();

    }

    public int calculateSalaryForUSA() {
        return this.usaSalaryCalculatorService.calculate();
    }

}
