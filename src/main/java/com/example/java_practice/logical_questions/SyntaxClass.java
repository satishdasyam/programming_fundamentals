package com.example.java_practice.logical_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SyntaxClass {

    public static void main(String[] args) {
        SyntaxClass obj = new SyntaxClass();
        //obj.forLoop();
        //System.out.println(fun());
        // System.out.println(obj.divide(4,0));
        //obj.divide(4, 0);
        int a[] = {4, 8, 10, 15, 16, 20};
        int b[] = {3, 4, 9, 14, 25};
        obj.sortTwoSortedArrays(a, b);
    }

    public void forLoop() {
        for (; true; ) {
            System.out.println("Hello");
            break;
        }
    }

    static int fun() {
        // static int x=0;
        int x = 0;
        return x++;
    }

    public int divide(int a, int b) {
        int c = -5;
        try {
            c = a / b;
        } catch (Exception e) {
            System.err.print("Exception");
        } finally {
            System.err.print("Finally");
        }
        return c;
    }

    public void sortTwoSortedArrays(int a[], int b[]) {
        int bIndex = 0;
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            while (b[bIndex] < a[i]) {
                resultList.add(b[bIndex]);
                if (bIndex != b.length - 1) {
                    bIndex++;
                }
            }
            if (b[bIndex] == a[i]) {
                resultList.add(a[i]);
                resultList.add(a[i]);
                if (bIndex != b.length - 1) {
                    bIndex++;
                }
            } else {
                resultList.add(a[i]);
                if (i == a.length - 1 && bIndex == b.length - 1) {
                    resultList.add(b[bIndex]);
                }
            }
        }
        System.out.println(Arrays.toString(resultList.toArray()));
    }
}
