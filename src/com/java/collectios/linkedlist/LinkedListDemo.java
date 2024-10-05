package com.java.collectios.linkedlist;


import java.util.LinkedList;
import java.util.List;

//add()
//add(index, element)
//addFirst()
//addLast()
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<>();
        list.add("Banana");//0
        list.add("Apple");//1
        list.add("Mango");//2
        list.add("Guava");//3
        list.add("Banana");//4
        list.add("Mango");//5
        System.out.println(list);
        list.removeFirstOccurrence("Banana");
        System.out.println(list);
        list.removeLastOccurrence("Apple");
        System.out.println(list);
        boolean guava = list.removeIf(t -> t.startsWith("Guava"));
        System.out.println(list);

//        list.add(3,"Strawberry");
////        System.out.println(list);
//        list.addFirst("Watermelon");
////        System.out.println(list);
//
//        list.addLast("Orange");
////        System.out.println(list);
//        list.remove();
//        System.out.println(list);
//        list.remove("Orange");
//        System.out.println(list);
//     list.remove(4);
//        System.out.println(list);
//        list.removeFirst();
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);

    }
}








