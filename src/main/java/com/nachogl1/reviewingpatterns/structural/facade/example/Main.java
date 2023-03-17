package com.nachogl1.reviewingpatterns.structural.facade.example;

public class Main {

    public static void main(String[] args) {

        SalaryCalculatorFacade salarieServiceFacade = new SalaryCalculatorFacade();

        System.out.println(salarieServiceFacade.calculateSalaryForUk());
        System.out.println(salarieServiceFacade.calculateSalaryForSpain());
        System.out.println(salarieServiceFacade.calculateSalaryForUSA());
    }
}
