package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("strawberry");
        fruits.add("mango");
//        System.out.println(fruits);

        List<String> sports= new ArrayList<>();
        sports.add("football");
        sports.add("volleyball");
        sports.add("cricket");
        sports.add("hockey");
//        System.out.println(sports);
        sports.addAll(fruits);
//        System.out.println(sports);




    }
}
