package com.example.java_practice.design_patterns;

import com.example.java_practice.design_patterns.adapter_pattern.Captain;
import com.example.java_practice.design_patterns.adapter_pattern.FishingBoatAdapter;
import com.example.java_practice.design_patterns.factory_pattern.PlanFactory;

public class PatternTest {

    public static void main(String[] args) {
        //BuilderPattern
        BuilderPattern pattern = new BuilderPattern.Builder("satish").addGrade(1).addrank(2).build();
        //Factory Pattern
        PlanFactory planFactory = new PlanFactory();
        System.out.println(planFactory.getPlan("DOMESTIC_PLAN").getRate());
        System.out.println(planFactory.getPlan("CORPORATE_PLAN").getRate());
        System.out.println(planFactory.getPlan("COMMERCIAL_PLAN").getRate());
        System.out.println(planFactory.getPlan(null));

        //Adapter Pattern
// The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
        Captain captain = new Captain(new FishingBoatAdapter());
        captain.row();
    }
}
