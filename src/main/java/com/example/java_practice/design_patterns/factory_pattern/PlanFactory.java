package com.example.java_practice.design_patterns.factory_pattern;

public class PlanFactory {

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
