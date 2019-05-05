package com.example.java_practice.constructor_exception;

import java.io.IOException;

public class MainClassCE {

    public static void main(String [] args){
        try {
            new AirJet();
        } catch (IOException e) {
            System.out.println("IOException is thrown in MainClassCE");
        }

    }
}
