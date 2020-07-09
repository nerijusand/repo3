package com.company;

import java.util.Random;

public class Lektuvas {

    public void isskleistiVaziuokle(){
        Random random = new Random();
        int x = random.nextInt(5);
        int y = 2/x;
        System.out.println("OK vaziukle sekmingai isskleista");

    }
}
