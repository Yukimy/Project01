package com.test.java;

import javax.swing.text.html.FormView;
import java.util.HashMap;

public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello,World!");
        System.out.println("123");

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "yjm");
        hashMap.put("age", "22");
        hashMap.put("college", "Tsinghua");
        hashMap.put("major", "computer");

        String name = hashMap.get("name");
        String age = hashMap.get("age");
        String college = hashMap.get("college");
        String major = hashMap.get("major");

        System.out.println(name);
        System.out.println("age = " + age);
        System.out.println("major = " + major);
        System.out.println("college = " + college);

    }
}
