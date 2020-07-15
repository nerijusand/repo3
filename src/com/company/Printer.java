package com.company;

public class Printer {
    static <T> void printArray (T[] object){
        int i;
        for (i = 0; i < object.length; i++) {

            System.out.println(object[i]);
        }


    }
}
