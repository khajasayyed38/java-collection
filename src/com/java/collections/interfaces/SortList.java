package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortList {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        Collections.sort(list);
        System.out.println(list);
        List<Integer> list1 = list.stream().sorted().toList();
        System.out.println(list1);

    }
}
