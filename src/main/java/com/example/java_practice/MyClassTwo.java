package com.example.java_practice;

 class MyClassTwo extends MyClass {
     int a =20;
    public void test() {
        MyClass obj1 = new MyClass();
       // MyClassTwo my = new MyClass();
        //MyClass my1 = new MyClassTwo();

        obj1.b = 2;

    }

    public int getA(){
        return a;
    }

    public static void main(String[] args){
        MyClass obj1 = new MyClass();
        // MyClassTwo my = new MyClass();
        MyClass my1 = new MyClassTwo();

        obj1.b = 2;
        System.out.println(obj1.getA());
        System.out.println(my1.getA());
    }

    @Override
    public void displayArray() {
        super.displayArray();
    }

    public void stringPalindrome() {
       // "aa", "aaa"
        String s = "Madam I'm Adam".toLowerCase();
        char[] charArray = s.toCharArray();

        StringBuilder sWithOnlyAlphabets = new StringBuilder();
        int j = sWithOnlyAlphabets.length() - 1;
        String isPalindrome = "YES";
        if(sWithOnlyAlphabets.length()==0){
            System.out.print("YES");
        }

        for(int k=0;k<s.length();k++){
            if(charArray[k]>=97||charArray[k]<=122){
                sWithOnlyAlphabets.append(charArray[k]);
            }
        }
        charArray = sWithOnlyAlphabets.toString().toCharArray();
        for (int i = 0; i < sWithOnlyAlphabets.length(); i++) {
            if(j<0){
                return;
            }
            if (charArray[i] != charArray[j]) {
                System.out.print("NO");
                return;
            }
            if (Math.abs(j - i) == 0 || Math.abs(j - i) == 1) {
                System.out.print("YES");
                return;
            }
            j--;
        }
    }
}
