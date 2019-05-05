package com.example.java_practice;

import java.util.*;

  public class MyClass {

    protected final int anInt;
    private int a = 10;
    int intArray[] = new int[4];

   public MyClass() {//Default constructor
       System.out.println("default constructor");
       intArray[0] = 0;
       intArray[1] = 1;
       intArray[2] = 2;
       intArray[3] = 3;
       anInt =1;
    }
    public MyClass(int a) {//parametarised constructor
       this();
       this.a=a;
       System.out.println("constructor with a variable:"+a);
        System.out.println(a);
    }

    public MyClass(int a, int b){
       this(a);
    }


     int b=1;


   public void divisibleBy3() {
       for(int i=0;i<10;i++){
           if(i%3==0){
               System.out.println(i);
           }
           if(i%2==0){
               System.out.println(i);
           }
           /*else if(i%2==0){
               System.out.println(i);
           }
           else {
               System.out.println("Not divisible by 3");
           }*/

       }
   }

   public  void displayArray(){
       for (int i=0;i<intArray.length;i++){

           System.out.println("i:"+i+" Val:"+intArray[i]);
       }
   }

    public int getA(){
        return a;
    }

    public int add() {
        return  a+b;
    }

    public  void addNumberToday(){
        int b=1;
        a+=1;
        System.out.print("value:"+b);
    }
     public  void access(){
        System.out.print("value:"+a);
     }

     public static void main(String[] args){
         MyClass obj1 = new MyClass();
         obj1.divisibleBy3();
         /*MyClass obj2 = new MyClass(10);
         MyClass obj3 = new MyClass(20);
         //obj1.displayArray();
         int temp = obj1.getA();
         int sum = obj1.add();
         int mul = sum*obj1.a;*/
         //MyClassTwo two = new MyClassTwo();
         //two.stringPalindrome();
         //obj1.addNumberToday();
         //obj1.a=1;
         //obj1.b = 0f;

         //obj2.a=2;
         //obj2.b = 3f;
         /*System.out.println("OBj1:a="+obj1.a+", "+"b="+obj1.b);
         System.out.println("OBj2:a="+obj2.a+", "+"b="+obj2.b);
         System.out.println("OBj3:a="+obj3.a+", "+"b="+obj3.b);*/
     }


















    public void second() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(4);
        IdentityHashMap<Integer, Integer> map = new IdentityHashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (map.containsKey(list.get(i))) {
                map.put(list.get(i), map.get(list.get(i))+1);
            }else{
                map.put(list.get(i), 1);
            }
        }

        System.out.println(map.toString());

        Iterator<Integer> iterator = map.keySet().iterator();
        List<Integer> uniqueValues = new ArrayList<>();
        List<Integer> duplicateValues = new ArrayList<>();

        while(iterator.hasNext()){
            int key = iterator.next();
            int value = map.get(key);
            if(map.get(key)==1){
                uniqueValues.add(key);
            }else{
                for(int k=0;k<value;k++){
                    duplicateValues.add(key);
                }
            }
        }
        Collections.sort(uniqueValues);
        Collections.sort(duplicateValues);
        for(int i=0;i<uniqueValues.size();i++){
            System.out.println(uniqueValues.get(i));
        }
        for(int i=0;i<duplicateValues.size();i++){
            System.out.println(duplicateValues.get(i));
        }
    }

   public void third(){
        //upc,code,category,itemPrice,couponAmount
       List<Map<String, Object>> coupons = new ArrayList<>();

       List<String> preferredCategories = new ArrayList<>();

       List<Map<String, Object>> finalCategories = new ArrayList<>();

       for(int i=0;i<coupons.size();i++){
           for(int j=0;j<preferredCategories.size();j++){
               if(coupons.get(i).get("category").equals(preferredCategories.get(j))){
                   finalCategories.add(coupons.get(i));
                   finalCategories.get(finalCategories.size()-1).remove("code");
                   break;
               }
           }

       }

       Collections.sort(finalCategories, new Comparator<Map<String, Object>>() {
           @Override
           public int compare(Map<String, Object> stringObjectMap, Map<String, Object> t1) {
               float left = (float)stringObjectMap.get("couponAmount")/(float)stringObjectMap.get("itemPrice");
               float right = (float)t1.get("couponAmount")/(float)t1.get("itemPrice");
               return Float.compare(right, left);
           }
       });

       List<Map<String, Object>> finalList= new ArrayList<>();
       int size = Math.min(finalCategories.size(),10);
       for(int i=0;i<size;i++){
           finalList.add(finalCategories.get(i));
       }

    }

}
