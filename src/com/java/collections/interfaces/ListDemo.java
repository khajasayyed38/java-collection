package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //1.Duplicate elements
        List<String> list= new ArrayList<>();
//        list.add("element1");
//        list.add("element1");
//        list.add("element2");
//        list.add("element2");
//        System.out.println(list);
//
//        //2.null elements
//        list.add(null);
//        list.add(null);
//        System.out.println(list);

        //3.insertion order
        list.add("element1");
        list.add("element3");
        list.add("element2");
        list.add("element4");
        System.out.println(list);

        //4.index
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }
}
