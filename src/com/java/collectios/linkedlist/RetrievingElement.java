package com.java.collectios.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
//first Element
//last Element
//given index
//get all elements by using loops
public class RetrievingElement {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Banana");//0
        list.add("Apple");//1
        list.add("Mango");//2
        list.add("Guava");//3
        list.add("Banana");//4
        list.add("Mango");//5
//        System.out.println(list);
//        String first = list.getFirst();
//        System.out.println(first);
//        String last = list.getLast();
//        System.out.println(last);
//        String s = list.get(3);
//        System.out.println(s);
//       for(int i=0;i< list.size();i++){
////           System.out.println(list.get(i));
//       }
//       for(String s:list){
////           System.out.println(s);
//       }
//       list.forEach(System.out::println);
//        list.removeFirst();
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
        // using iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String li = iterator.next();
            System.out.println(li);
        }
    }
}














