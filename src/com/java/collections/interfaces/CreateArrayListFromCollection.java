package com.java.collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        List<Integer> firstFiveNumber= new ArrayList<>();
        firstFiveNumber.add(2);
        firstFiveNumber.add(3);
        firstFiveNumber.add(5);
        firstFiveNumber.add(7);
        firstFiveNumber.add(11);

        List<Integer> nextFiveNumber= new ArrayList<>(firstFiveNumber);
        nextFiveNumber.add(13);
        nextFiveNumber.add(17);
        nextFiveNumber.add(19);
        nextFiveNumber.add(23);
        nextFiveNumber.add(29);
        System.out.println(nextFiveNumber);
    }
}
