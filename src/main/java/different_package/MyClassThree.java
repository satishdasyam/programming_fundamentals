package different_package;

import com.example.java_practice.MyClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class MyClassThree extends MyClass {

    public void access() {
        MyClass obj1 = new MyClass();
        // obj1.b = 2;
        obj1.getA();
        System.out.print(anInt);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        a = rotLeft(a, 4);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        ArrayList<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(a[i]);
        }
        int shift = Math.abs(size - d);
        int i = 0;
        for (int j = size - 1; j <= 2; j--) {
            list.add(i, list.get(j));
            i++;
        }
        for (int j = size - 1; j >= shift; j--) {
            list.remove(j);
        }

        for (i = 0; i < size; i++) {
            a[i] = list.get(i);
        }

        return a;
    }

    public String returnName(String[] votes) {
        HashMap<String, Integer> voteCount = new HashMap<>();
        //String highestKey = "";
        for (int i = 0; i < votes.length; i++) {
            String name = votes[i];
            if (voteCount.containsKey(name)) {
                voteCount.put(name, voteCount.get(name) + 1);
            } else {
                voteCount.put(name, 1);
            }
        }
        Object[] keyValues = voteCount.keySet().toArray();
        ArrayList<String> highestKeys = new ArrayList<>();
        int highestCount = 0;
        for (int i = 0; i < voteCount.size(); i++) {
            if (voteCount.get(keyValues[i]) >= highestCount) {
                highestKeys.add(keyValues[i].toString());
                highestCount = voteCount.get(keyValues[i]);
            }
        }
        Collections.sort(highestKeys);
        return !highestKeys.isEmpty() ? highestKeys.get(highestKeys.size() - 1) : "";
    }
}
