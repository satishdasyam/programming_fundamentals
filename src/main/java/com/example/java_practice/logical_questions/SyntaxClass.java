package com.example.java_practice.logical_questions;

public class SyntaxClass {

    public static void main(String[] args){
        SyntaxClass obj = new SyntaxClass();
        //obj.forLoop();
        //System.out.println(fun());
       // System.out.println(obj.divide(4,0));
        obj.divide(4,0);
    }

    public void forLoop(){
        for(;true;){
            System.out.println("Hello");
            break;
        }
    }

    static int fun() {
       // static int x=0;
        int x=0;
        return x++;
    }

    public int divide(int a, int b){
        int c= -5;
        try{
            c=a/b;
        }catch (Exception e){
            System.err.print("Exception");
        }finally {
            System.err.print("Finally");
        }
        return c;
    }
}
