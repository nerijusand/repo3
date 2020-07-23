package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UzduotisNr8 {
    public void uzduotiesNrSp() {
        ArrayList<String> kolekcija = new ArrayList<>();
        for (; ; ) {
            System.out.println("iveskite zodi");
            Scanner sc = new Scanner(System.in);
            String zodis = sc.next();

            if (zodis.equalsIgnoreCase("stop")) {
                break;
            }

            kolekcija.add(zodis);


        }
        ArrayList<String> nkolekcija = zodzioTikrinimas(kolekcija);
        System.out.println(nkolekcija);

    }


    public static ArrayList<String> zodzioTikrinimas(ArrayList<String> sarasas) {
        ArrayList<String> sarasasBeVenoduZ = new ArrayList<>();

        for (String zodisSar : sarasas) {

            if (!sarasasBeVenoduZ.contains(zodisSar)) {
                sarasasBeVenoduZ.add(zodisSar);
            }
        }

        return sarasasBeVenoduZ;
    }
}
