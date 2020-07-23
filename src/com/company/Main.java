package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(12);
        arrayList.add(13);
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
    }

}