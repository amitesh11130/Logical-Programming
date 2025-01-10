package com.ak.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find_Min_And_Max {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(47);
        list.add(55);
        list.add(21);
        list.add(86);
        list.add(9);
        list.add(81);

        System.out.println("Minimum value :: "+minValue(list));
        System.out.println("Maximum value :: "+maxValue(list));
    }

    public static Integer minValue(List<Integer> list){
        if (list == null || list.size()==0) {
            return Integer.MAX_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return sortedList.get(0);
    }
    public static Integer maxValue(List<Integer> list){
        if (list == null || list.size()==0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedList = new ArrayList<>(list);
        Collections.sort(sortedList);

        return sortedList.get(sortedList.size()-1);
    }
}
