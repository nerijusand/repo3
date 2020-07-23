package com.company;

import java.util.*;

public class UzduotisNr7 {


    public  void uzduotisNr7sp (){
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
        spausdintiIlgiausiZodi(kolekcija);
    }

    public static void spausdintiIlgiausiZodi(ArrayList<String> sarasas){
          String maxZodis = sarasas.get(0);

        for (int i = 0; i < sarasas.size(); i++){

            if (maxZodis.length() < sarasas.get(i).length()){
                maxZodis = sarasas.get(i);
            }

        }
        System.out.println("Ilgiausias zodis i saraso yra: "+maxZodis);
    }
}

