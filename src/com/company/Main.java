package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        Miskas miskas = new Miskas();
        miskas.medziai.addAll(randomSarasas());

        System.out.println(miskas.ivarusMiskas());
        System.out.println("___________________________________");
        System.out.println(miskas.spygliuociumiskas());
        System.out.println("___________________________________");
        System.out.println(miskas.berzuMiskas());


    }

    public static ArrayList randomSarasas() {
        Random random = new Random();
        ArrayList randArray = new ArrayList();
        Medis azuolas = new Azuolas();
        Medis berzas = new Berzas();
        Medis egle = new Egle();
        Medis pusis = new Pusis();
        Medis kadagis = new Kadagys();

        int rnNum = random.nextInt(20);
        for (int i = 0; i < rnNum; i++) {
            randArray.add(azuolas.turi());
        }
        for (int i = 0; i < rnNum; i++) {
            randArray.add(berzas.turi());
        }
        for (int i = 0; i < rnNum; i++) {
            randArray.add(egle.turi());
        }
        for (int i = 0; i < rnNum; i++) {
            randArray.add(pusis.turi());
        }
        for (int i = 0; i < rnNum; i++) {
            randArray.add(kadagis.turi());
        }
        return randArray;

    }

}