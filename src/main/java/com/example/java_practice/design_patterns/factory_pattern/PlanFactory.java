package com.example.java_practice.design_patterns.factory_pattern;

public class PlanFactory {

    /**This type of design pattern comes under creational pattern as this
    pattern provides one of the best ways to create an object.

    In Factory pattern, we create object without exposing the creation
    logic to the client and refer to newly created object using a common interface.

     When a class doesn't know what sub-classes will be required to create*/

    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        switch (planType) {
            case "DOMESTIC_PLAN":
                return new DomesticPlan();
            case "CORPORATE_PLAN":
                return new CorporatePlan();
            case "COMMERCIAL_PLAN":
                return new CommercialPlan();
            default:
                return null;
        }
    }
}
