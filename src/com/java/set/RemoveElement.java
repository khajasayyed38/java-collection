package com.java.set;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        Set<String> programmingLanguage= new HashSet<>();
        programmingLanguage.add("Java");
        programmingLanguage.add("JavaScript");
        programmingLanguage.add("Python");
        programmingLanguage.add("Spring");
        programmingLanguage.add("Hibernate");
//        programmingLanguage.remove("Java");
//        System.out.println(programmingLanguage);
        Set<String> program= new HashSet<>();
        program.add("Java");
        program.add("Python");
        programmingLanguage.removeAll(program);
        System.out.println(programmingLanguage);
        programmingLanguage.clear();;
        System.out.println(programmingLanguage);

    }
}
