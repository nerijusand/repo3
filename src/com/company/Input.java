package com.company;

import java.util.Scanner;

public class Input {
    private int skaicius;
    public void  kvieciaSkaiciu () {
        System.out.println("Iveskite skaiciu");
        Scanner scanner = new Scanner(System.in);
        skaicius = scanner.nextInt();
    }
    public void spausdinaSkaiciu(){
        System.out.println(skaicius);
    }
}
