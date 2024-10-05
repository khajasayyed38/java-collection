package com.java.set;

import java.util.*;

public class IterateSet {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(7);
//        System.out.println(set);
//        for (int i=0;i<set.size();i++){
//            System.out.println(set.g);
//        }
//        List<Integer> list= new ArrayList<>();
//        list.add(1);
//        System.out.println(list.get(0));
//        for(int s:set){
//            System.out.println(s);
//        }
//        for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext(); ) {
//            Integer s =  iterator.next();
//            System.out.println(s);
//        }
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Object s =  iterator.next();
//            System.out.println(s);
//        }
//        set.forEach(System.out::println);
//        set.stream().filter(t->t!=2).forEach(System.out::println);
//    for(int s:set){
//        if(s==2){
//            System.out.println(s);
//        }
//    }
        boolean contains = set.contains(1);
        System.out.println(contains);
    }
}
