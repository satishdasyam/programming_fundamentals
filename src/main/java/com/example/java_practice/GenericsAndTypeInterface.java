package com.example.java_practice;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndTypeInterface {


    public static void main(String [] args){
        ArrayList<Item<Integer>> listOfIntegerItems = new ArrayList<>();
        /*Item<Integer> item = new Item<>();
        listOfIntegerItems.add(item);*/
        GenericsAndTypeInterface.addItem(Integer.valueOf(10),listOfIntegerItems);
        GenericsAndTypeInterface.outputItems(listOfIntegerItems);
    }

    public static <U> void addItem(U u, List<Item<U>> items) {
        Item<U> item = new Item<>();
        item.set(u);
        item.add(item);
    }

    public static <U> void outputItems(List<Item<U>> items) {
        int counter = 0;
        for (Item<U> item : items) {
            U itemContents = item.get();
            System.out.println("Item #" + counter + " contains [" + itemContents.toString() + "]");
            counter++;
        }
    }


    static class Item<U> {
        U u;
        Item<U> item;

        public void set(U u) {
            this.u = u;
        }

        public U get(){
            return u;
        }

        public void add(Item<U> item) {
            this.item = item;
        }

        @Override
        public String toString() {
            return u.toString();
        }
    }
}
