package com.example.java_practice.design_patterns.adapter_pattern;

/**
 *
 * Device class (adaptee in the pattern). We want to reuse this class.
 * Fishing boat moves by sailing.
 *
 */

public class FishingBoat {
    public void sail() {
        System.out.println("The fishing boat is sailing");
    }
}
