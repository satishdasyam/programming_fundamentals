package com.example.java_practice.constructor_exception;

import java.io.IOException;

public class AirJet extends AirPlane {

    public AirJet() throws IOException {
        //super();
        System.out.println("AirJet");
        /*try{
            //super();
            throw new IOException();
        }catch (IOException e){
            System.out.println("IOException is thrown in AirJet");
        }*/
    }
}
