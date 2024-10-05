package com.java.collections.interfaces;

import java.util.Arrays;
import java.util.List;

public class DifferentWayToIterateArrayList {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("C","C++","Java","Spring","Hibernate");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("---------------");
        for(String s:list){
            System.out.println(s);
        }
        System.out.println("---------------");
        list.forEach(System.out::println);
    }
}
