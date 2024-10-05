package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

//isEmpty method
//size() method
//index using get() method
//changing value of index using set() method
public class AccessElementFromArrayList {
    public static void main(String[] args) {
        List<String> topProgramingLanguage= new ArrayList<>();
        System.out.println(topProgramingLanguage.isEmpty());

        topProgramingLanguage.add("C");
        topProgramingLanguage.add("Java");
        topProgramingLanguage.add("C++");
        topProgramingLanguage.add("Python");
        topProgramingLanguage.add(".net");
//        System.out.println(topProgramingLanguage.size());

        System.out.println("best programming language :"+topProgramingLanguage.get(3));
        topProgramingLanguage.set(4,"Hibernate");
        System.out.println(topProgramingLanguage);


    }
}
