package com.java.set;

import java.util.HashSet;
import java.util.Set;

//no insertion order
//no duplicate element
public class HashSetDemo {
    public static void main(String[] args) {
        //no duplicate element
//        Set<String> set= new HashSet<>();
//        set.add("element1");
//        set.add("element1");
//        System.out.println(set);
//
//        //no insertion order
//        Set<String> s= new HashSet<>();
//        s.add("element1");
//        s.add("element4");
//        s.add("element3");
//        s.add("element2");
//        s.add("element5");
//        System.out.println(s);
        Set<String> programmingLanguage= new HashSet<>();
        programmingLanguage.add("Java");
        programmingLanguage.add("JavaScript");
        programmingLanguage.add("Python");
        programmingLanguage.add("Spring");
        programmingLanguage.add("Hibernate");
//        System.out.println(programmingLanguage);
//        programmingLanguage.add("Java");
//        System.out.println(programmingLanguage);
        Set<String> fruits = new HashSet<>(programmingLanguage);
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");


        System.out.println(fruits);
    }
}









