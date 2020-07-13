package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Input sk = new Input();
        int i = 1;
        int a = 2;
        for (i = 1; i < a; a++) {
            try {
                sk.kvieciaSkaiciu();
                sk.spausdinaSkaiciu();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Netinkamas skaicius");

            }
        }
    }

}
