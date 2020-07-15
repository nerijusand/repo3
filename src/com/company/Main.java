package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class Conteiner <T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Conteiner2 <E0,E1>{
    private E0 e0;
    private E1 e1;

    public E0 getE0() {
        return e0;
    }

    public void setE0(E0 e0) {
        this.e0 = e0;
    }

    public E1 getE1() {
        return e1;
    }

    public void setE1(E1 e1) {
        this.e1 = e1;
    }
}

public class Main {

    public static void main(String[] args) {

//        Conteiner conteiner = new Conteiner();
//        conteiner.setT(10);
//        Integer x = (Integer)conteiner.getT();
//        System.out.println(x);
//        conteiner.setT(5);
//        x = (Integer)conteiner.getT();
//        System.out.println(x);
//
//        Conteiner<Integer> conteinerGeneric = new Conteiner<>();
//        conteinerGeneric.setT(54);
//
//        Conteiner2<String,Integer> conteiner2 = new Conteiner2<>();
//        conteiner2.setE0("nerijus");
//        conteiner2.setE1(35);

        Integer[] var1 = {1, 2, 3};
        String [] var2 = {"Hallo", "world"};
        Printer printer = new Printer();
        printer.printArray(var1);

        printer.printArray(var2);
    }

}